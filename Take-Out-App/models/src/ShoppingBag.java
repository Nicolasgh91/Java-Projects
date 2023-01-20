import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ShoppingBag <T extends PricedItem <Integer> > {
    private Map<T,Integer> shoppingBag;

    // Constructor
    public ShoppingBag() {

        this.shoppingBag = new HashMap<>();
    }

    public void addItem(T item){


        int acumulador = 0;
        // If it doesn't contain the given key,
        if (!shoppingBag.containsKey(item)){
            // It enters here if there is 1 or more items,
            if (!shoppingBag.isEmpty()) {
                shoppingBag.put(item, acumulador += 1);
                System.out.println(acumulador);
            } else {
                // It enters here the first time an item is added,
                shoppingBag.put(item, acumulador = 1);
                System.out.println(acumulador);
            }
        }

    }

    public int getTotalPrice(){

        int totalPrice = 0;

        for (Map.Entry<T, Integer> eachPair : shoppingBag.entrySet() ){

            totalPrice += eachPair.getKey().getPrice() * eachPair.getValue();
        }
        return totalPrice;
    }



}
