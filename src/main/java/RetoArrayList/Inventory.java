package RetoArrayList;
import java.util.ArrayList;

public class Inventory {
    private final ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public boolean removeItem(String itemName) {
        Item busqueda = findItem(itemName);
        boolean exito = items.remove(busqueda);
        return exito;
    }

    public Item findItem(String itemName) {
        if (itemName == null) return null;
        for (Item item : items) {
            if (itemName.equals(item.getName())) {
                return item;
            }
        }
        return null;
    }

    public double getTotalWeight() {
        double totalWeight = 0.0;
        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

        // Este getter no es necesario modificarlo
        public ArrayList<Item> getItems() {
            return items;
        }
    }

