import java.util.ArrayList;

public class GroceryList {
    private ArrayList<GroceryItemOrder> items = new ArrayList<>();
    private int num;

    public GroceryList(){
        ArrayList<GroceryItemOrder> items =  new ArrayList<>(10);
        num=0;
    }

    public void add(GroceryItemOrder item){
        if(items.size() != 10){
            items.add(item);
        }
    }

    public double getTotalCost(){
        double totalCost = 0;
        for (int i=0; i< items.size(); i++){
            totalCost += items.get(i).getCost();
        }
        return totalCost;
    }
}
