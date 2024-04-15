import java.util.*;

record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){
        this(name, "Dairy", 1);
    }

    @Override
    public String toString(){
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class Main {
    public static void main(String[] args) {

        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("Milk");
        groceryArray[1] = new GroceryItem("Apples", "Produce", 6);
        groceryArray[2] = new GroceryItem("Oranges", "Produce", 5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Yogurt"));
        groceryList.add(new GroceryItem("Milk"));
        groceryList.add(new GroceryItem("Oranges", "Produce", 5));
        groceryList.set(0, new GroceryItem("Apples", "Produce", 6));
        groceryList.remove(1);
        System.out.println(groceryList);
    }
}