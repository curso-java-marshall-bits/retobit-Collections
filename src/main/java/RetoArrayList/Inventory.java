package RetoArrayList;
import java.util.ArrayList;

public class Inventory {
    private final ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        // Aquí tu código
    }

    public boolean removeItem(String itemName) {
        // Aquí tu código
        return false;
    }

    public Item findItem(String itemName) {
        // Aquí tu código
        return null;
    }

    public double getTotalWeight() {
        // Aquí tu código
        return 0.0; // sustituye esto por el valor real
    }

    // Este getter no es necesario modificarlo
    public ArrayList<Item> getItems() {
        return items;
    }
}
