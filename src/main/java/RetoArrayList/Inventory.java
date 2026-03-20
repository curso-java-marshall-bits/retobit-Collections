package RetoArrayList;
import java.util.ArrayList;

public class Inventory {
    private final ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public boolean removeItem(String itemName) {
        for (Item i : items){
            if (itemName.equals(i.getName())){
                items.remove(i);
                return true;
            }
        }
        return false;
    }

    public Item findItem(String itemName) {
        for (Item i : items){
            if (itemName.equals(i.getName())){
                return i;
            }
        }
        return null;
    }

    public double getTotalWeight() {
        double suma = 0;
        for(Item i : items){

            suma+=i.getWeight();

        }
        return suma; // sustituye esto por el valor real
    }

    // Este getter no es necesario modificarlo
    public ArrayList<Item> getItems() {
        return items;
    }
}
