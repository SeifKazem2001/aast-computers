public class GroceryItemOrder {
    private String name;
    private int quantity;
    private double pricePerItem;

    public GroceryItemOrder(String name, double pricePerItem){
        this.name = name;
        this.pricePerItem = pricePerItem;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCost(){
        return quantity * pricePerItem;
    }
}
