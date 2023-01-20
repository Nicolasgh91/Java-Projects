import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FoodMenu {
    private List<Food> menu;

    public FoodMenu() {
        this.menu = new ArrayList<>();
        menu.add(0,new Food("Pizza","Cebolla",20) );
        menu.add(1,new Food("Hamburguesa", "Bacon & Cheese", 10));
        menu.add(2,new Food("Empanada","Calabaza",5));
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        int number = 1;
        for (Food food : menu) {
            sb.append(number++);
            sb.append(". ");
            sb.append(food.toString());
        }
        return sb.toString();
    }

    public Food getFood(int index){

        try {
            if (index < 0 || index > menu.size()) {
                return null;
            } else {
                return menu.get(index -1);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Food getLowestCostFood(){

        List<Food> lowestCostFood = new ArrayList<>();

        int min = menu.get(0).getPrice();

        for (Food item:menu) {

            if (item.getPrice() <= min){
                min = item.getPrice();
                lowestCostFood.clear();
                lowestCostFood.add(item);
            }
        }
        return lowestCostFood.get(0);

        // menu.stream().min(Comparator.comparing(Food::getPrice)).get();

    }



}
