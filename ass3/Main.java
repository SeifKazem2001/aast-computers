public class Main {
    public static void main(String[] args) {
        GroceryList groceryList = new GroceryList();

        GroceryItemOrder itemOne = new GroceryItemOrder("chocolate", 10.0);
        itemOne.setQuantity(5);
        System.out.println(itemOne.getCost());
        groceryList.add(itemOne);

        GroceryItemOrder itemTwo = new GroceryItemOrder("cheese", 20.0);
        itemTwo.setQuantity(2);
        System.out.println(itemTwo.getCost());
        groceryList.add(itemTwo);

        System.out.println("The total cost of groceries : " + groceryList.getTotalCost());
    }
}