import java.util.ArrayList;
import java.util.List;

public class Meal
{
    private List<Item> mealItems = new ArrayList<Item>();

    public void addItem(Item item) {
        this.mealItems.add(item);
    }

    public float getCost() {
        float cost = 0.0f;

        for (Item item : this.mealItems) {
            cost += item.price();
        }

        return cost;
    }

    public void displayMealItems() {
        for (Item item : this.mealItems) {
            System.out.print("Item: " + item.name());
            System.out.print(", Packaging: " + item.packing().pack());
            System.out.println(", Price: " + item.price());
         }		
    }
}