package RetoArrayList;
import java.util.ArrayList;

public class Inventory {
    private final ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public boolean removeItem(String itemName) {
        for(Item item: items){
            if(item.getName().equals(itemName)){
               return items.remove(item);
            }
        }
        return false;
    }

    public Item findItem(String itemName) {
        for(Item item: items){
            if(item.getName().equals(itemName)){
               return item;
            }
        }
        return null;
    }

    public double getTotalWeight() {
        double totalWeight = 0;
        for(Item item: items){
            totalWeight += item.getWeight();
        }
        return totalWeight; // sustituye esto por el valor real
    }

    // Este getter no es necesario modificarlo
    public ArrayList<Item> getItems() {
        return items;
    }
}
