package RetoArrayList;
import java.util.ArrayList;

public class Inventory {
    private final ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public boolean removeItem(String itemName) {
        for (Item item : items){
            if (item.getName().equals(itemName)) {
                items.remove(item);
                return true;
            }
        }

        return false;
    }

    public Item findItem(String itemName) {
        for (Item item : items){
            if (item.getName().equals(itemName)) {
                return item;
            }
        }
        return null;
    }

    public double getTotalWeight() {
        // Aquí tu código
        double totalWeight = 0;

        for (Item item : items){
            totalWeight += item.getWeight();
        }
        return totalWeight; // sustituye esto por el valor real
    }

    // Este getter no es necesario modificarlo
    public ArrayList<Item> getItems() {
        return items;
    }

    public static void main(String[] args) {
        Inventory bolsa = new Inventory();
        Item cosa = new Item("Puchero",33);
        bolsa.addItem(cosa);
        System.out.println("Holaa");
        for (Item item : bolsa.items){
            System.out.println(item.getName());
        }
    }
}
