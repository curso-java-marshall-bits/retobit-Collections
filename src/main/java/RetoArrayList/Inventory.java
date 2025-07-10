package RetoArrayList;
import java.util.ArrayList;

public class Inventory {
    private final ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {

    }

    public boolean removeItem(String itemName) {
        return false;
    }

    public Item findItem(String itemName) {
        return new Item("", 0);
    }

    public double getTotalWeight() {
        return 0.0;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
