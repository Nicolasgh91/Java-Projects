public class Food implements PricedItem<Integer> {

    private String name;
    private String description;
    private int price;

    public Food(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    // INIT PricedItem Interface, method Implementations
    @Override
    public Integer getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(Integer price) {
        this.price = price;
    }
    // END PricedItem Interface, method Implementations


    @Override
    public String toString() {
        return String.format("\n %s: %s    Cost: %d\n", this.name, this.description, this.price);
    }


}
