import java.util.Scanner;


// Outer
class ShopItems {
    int totalCount;

    // Inner
    class NonVegan{
        int iceCreamCount;
        int shakeCount;
        int totalCount;

        public void increaseCount(int iceCreamCount, int shakeCount, int iceCreamNonVeganCount){

            totalCount += iceCreamNonVeganCount;
            ShopItems.this.totalCount += iceCreamCount + shakeCount + iceCreamNonVeganCount;
        }
    }

    // Inner
    public class Vegan{

    int smoothieCount;
    int slushieCount;
    int totatlCount;

    public void increaseCount(int smoothieCount, int slushieCount){
        this.smoothieCount += smoothieCount;
        this.slushieCount += slushieCount;
        ShopItems.this.totalCount += smoothieCount + slushieCount;
    }


    }


}




public class IceCreamShop {

    public static void main(String[] args) {
        int orderType = 0;
        Scanner input = new Scanner(System.in);
        int itemCount = 0;
        String itemName;

        ShopItems shopItems = new ShopItems();
        ShopItems.Vegan vegan = shopItems.new Vegan();
        ShopItems.NonVegan nonVegan = shopItems.new NonVegan();



        System.out.println("Hello! Welcome to the ice cream shop. We are ready to take your order. For ice-cream type 1, for shakes type 2, for smoothies type 3, and for slushies type 4. If you are done ordering type 0.");
        orderType = input.nextInt();

        while(orderType != 0) {
            System.out.println("How many items of this item would you like to order?");
            itemCount = input.nextInt();

                shopItems.totalCount += itemCount;

                    if(orderType == 1){
                        itemName = "ice cream";
                        nonVegan.iceCreamCount += itemCount;
                    } else if(orderType == 2) {
                        itemName = "shake";
                        nonVegan.shakeCount += itemCount;
                    } else if(orderType == 3) {
                        itemName = "smoothie";
                        vegan.smoothieCount += itemCount;
                    } else if(orderType == 4) {
                        itemName = "slushie";
                        vegan.smoothieCount += itemCount;
                    } else {
                    break;
            }

            System.out.println("Adding " + itemCount + " of the item "+ itemName + " to your order!");

            System.out.println("Type a number for the next item in your order:\n1: Ice cream\n2: Shake\n3: Smoothie\n4: Slushie\n");
            orderType = input.nextInt();

        }

        System.out.println("Thank you for your order!\n Today we have sold "+ shopItems.totalCount + " of sweetness " +
                "\n" + (nonVegan.iceCreamCount + nonVegan.shakeCount) + " have been ice cream and shakes " + "\n" +
                (vegan.smoothieCount + vegan.slushieCount) + " have been smoothies and slushies" );



    }
}