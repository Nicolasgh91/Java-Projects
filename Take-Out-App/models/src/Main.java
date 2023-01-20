import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hi there! Please tell me your name: ");
        String customerName = input.nextLine();

        System.out.println("Please indicate how much money you have to spend, do so with int numbers :");

        int money = input.nextInt();
        if (money <= 0){
            System.out.println("Please add more money to be able to shop.");
        }

        Customer customer = new Customer(customerName,money);
        TakeOutSimulator takeOutSimulator = new TakeOutSimulator(customer,input);

        takeOutSimulator.startTakeOutSimulator();






    }
}
