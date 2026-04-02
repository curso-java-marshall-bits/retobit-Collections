package RetoArrayList;

import java.util.ArrayList;

public class Inventory {
    private final ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        this.items.add(item);
    }

    public boolean removeItem(String itemName) {
        Item item = this.findItem(itemName);
        if (item != null ){
            this.items.remove(item);
            return true;
        }
        return false;
    }

    public Item findItem(String itemName) {
        for (Item item : this.items) {
            if (itemName.equals(item.getName())) {
                return item;
            }
        }
        return null;
    }

    public double getTotalWeight() {
        double totalWeight = 0;
        for (Item item : this.items) {
            totalWeight += item.getWeight();
        }
        return totalWeight; // sustituye esto por el valor real
    }

    // Este getter no es necesario modificarlo
    public ArrayList<Item> getItems() {
        return items;
    }
}
