package RetoArrayList;

import java.util.ArrayList;

public class Inventory {
    private final ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        // Aquí tu código
        this.items.add(item);
    }

    public boolean removeItem(String itemName) {
        // Aquí tu código
        Item item = findItem(itemName);
        return this.items.remove(item);
    }

    public Item findItem(String itemName) {
        // Aquí tu código
        for (Item item : this.items) {
            if (item.getName().equals(itemName)) {
                return item;
            }
        }
        return null;
    }

    public double getTotalWeight() {
        // Aquí tu código
        double counter = 0;
        for (Item item : this.items) {
            counter += item.getWeight();
        }
        return counter; // sustituye esto por el valor real
    }

    // Este getter no es necesario modificarlo
    public ArrayList<Item> getItems() {
        return this.items;
    }
}
