package RetoArrayList;
import java.util.ArrayList;

public class Inventory {
    private final ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public boolean removeItem(String itemName) {
        for(Item item: items){
            if (item.getName().equals(itemName)){
                items.remove(item);
                return true;
            }
        }
        return false;
    }

    public Item findItem(String itemName) {
        for(Item item: items){
            if (item.getName().equals(itemName)){
                return item;
            }
        }
        return null;
    }

    public double getTotalWeight() {
        double pesoTotal = 0.0;
        for (Item item: items){
            pesoTotal += item.getWeight();
        }
        return pesoTotal;
    }

    // Este getter no es necesario modificarlo
    public ArrayList<Item> getItems() {
        return items;
    }
}
