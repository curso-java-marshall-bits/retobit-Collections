package RetoArrayList;
import java.util.ArrayList;

public class Inventory {
    private final ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        // Aquí tu código
    	items.add(item);
    }

    public boolean removeItem(String itemName) {
        // Aquí tu código
    	   for (int i = 0; i < items.size(); i++) {
    	        if (items.get(i).getName().equals(itemName)) {
    	            items.remove(i);
    	            return true;
    	        }
    	    }
    	    return false;
    }

    public Item findItem(String itemName) {
        // Aquí tu código
    	for (Item item : items) {
            if (item.getName().equals(itemName)) {
                return item;
            }
        }
        return null;
    }

    public double getTotalWeight() {
        // Aquí tu código
    	 double totalWeight = 0;

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
