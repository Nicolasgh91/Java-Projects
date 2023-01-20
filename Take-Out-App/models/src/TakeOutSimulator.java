import java.util.Scanner;

public class TakeOutSimulator {

    private Customer customer;
    private FoodMenu menu;
    private Scanner input;

    public TakeOutSimulator(Customer customer, Scanner input) {
        this.customer = customer;
        this.menu = new FoodMenu();
        this.input = input;
    }

    private <T> T getOutputOnIntInput(String userInputPrompt, IntUserInputRetriever<T> intUserInputRetriever){

        while (true) {
            // int userInput = 0;
            System.out.println(userInputPrompt);

            // Checks if the input from the user has an int
            if (input.hasNextInt()) {

                // Stores the int
                int userInput = input.nextInt();

                try {
                    return intUserInputRetriever.produceOutputOnIntUserInput(userInput);
                } catch (IllegalArgumentException e) {
                    System.out.println(input.nextInt() + " is not a valid input. Try again!");
                }
            } else {
                System.out.println("Input needs to be an `int` type.");
                //userInput = input.nextInt();
            }
        }
       // return (T) intUserInputRetriever.produceOutputOnIntUserInput(userInput);
    }

    public boolean shouldSimulate(){

        String userPrompt = "Enter 1 to CONTINUE simulation or 0 to EXIT program:";

        IntUserInputRetriever<Boolean> intUserInputRetriever = selection -> {

            if (selection == 1 && customer.getMoney() >= menu.getLowestCostFood().getPrice()){
                return true;
            } else if (selection == 0 || customer.getMoney() < menu.getLowestCostFood().getPrice()) {
                System.out.println("You don't have enough money to continue shopping - ending simulation...");
                return false;
            } else {
                throw new IllegalArgumentException();
            }

        };
            return Boolean.TRUE.equals(getOutputOnIntInput(userPrompt,intUserInputRetriever));

    }

    public Food getMenuSelection(){

        String userPrompt = "Please indicate only the number of the item you want:\n" + menu.toString();

        IntUserInputRetriever<Food> intUserInputRetriever = selection -> {

            if (menu.getFood(selection) != null){
                return menu.getFood(selection);
            } else {
                throw new IllegalArgumentException();
            }
        };
        return getOutputOnIntInput(userPrompt,intUserInputRetriever);
    }

    public boolean isStillOrderingFood(){

        String userPrompt = "You have $" + customer.getMoney() + ".- available to spend. \nEnter 1 to continue shopping or 0 to checkout: ";

        IntUserInputRetriever<Boolean> intUserInputRetriever = selection -> {

            if (selection == 1){
                System.out.println(userPrompt);
                return true;
            } else if (selection == 0){
                return false;
            } else {
                throw new IllegalArgumentException();
            }
        };

        // Boolean.TRUE.equals(getOutputOnIntInput(userPrompt,intUserInputRetriever));
        return getOutputOnIntInput(userPrompt,intUserInputRetriever);
    }

    public void checkoutCustomer(ShoppingBag shoppingBag){

        System.out.println("Processing payment...");

        if (shoppingBag.getTotalPrice() <= customer.getMoney()){

            customer.setMoney(customer.getMoney() - shoppingBag.getTotalPrice());

            System.out.println("Your remaining money is: " + customer.getMoney());
            System.out.println("Thank you and enjoy your meal! See you soon!");
        }
    }

    public void takeOutPrompt(){

        ShoppingBag<Food> shoppingBag = new ShoppingBag<>();

        int customerMoneyLeft = customer.getMoney();

        while (isStillOrderingFood()){
            System.out.println("You have $" + customerMoneyLeft + " left to spend.");
            System.out.println("Today's Menu Options are: ");
            Food selectedFood = getMenuSelection();

            if (selectedFood.getPrice() <= customerMoneyLeft){

                customerMoneyLeft -= selectedFood.getPrice();
                shoppingBag.addItem(selectedFood);

            } else if (selectedFood.getPrice() > customerMoneyLeft) {
                System.out.println("The chosen items exceed the amount of money left, please pick again");
            } else {
                System.out.println("Are you done placing the order?");
            }
        }
        checkoutCustomer(shoppingBag);
    }

    public void startTakeOutSimulator(){

        do {
            System.out.println("Hello " + customer.getName() + ", welcome to my restaurant! I hope you like the food here");
            takeOutPrompt();
        } while (shouldSimulate());
    }

}
