package RetoArrayList;
import java.util.ArrayList;

public class Inventory {
    private final ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        // Aquí tu código
        items.add(item);
    }

    public boolean removeItem(String itemName) {
        for (Item item : items) {
            if ( item.getName().equals(itemName) ) {
                items.remove(item);
                return true;
            }
        }
        return false;
    }

    public Item findItem(String itemName) {
        // Aquí tu código
        for (Item item : items) {
            if ( item.getName().equals(itemName) ) {
                return item;
            }
        }
        return null;
    }

    public double getTotalWeight() {
        // Aquí tu código
        double pesoTotal=0;
        for (Item item : items) {
            pesoTotal=pesoTotal+ item.getWeight();
        }


        return pesoTotal; // sustituye esto por el valor real
    }

    // Este getter no es necesario modificarlo
    public ArrayList<Item> getItems() {
        return items;
    }
}
