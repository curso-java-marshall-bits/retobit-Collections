package RetoArrayList;
import java.util.ArrayList;

public class Inventory {
    private final ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        // Aquí tu código
        this.items.add(item);
    }

    public boolean removeItem(String itemName) {
        // Busca en la lista, borra si coincide el nombre y devuelve true o false automáticamente
        return this.items.removeIf(item -> item.getName().equalsIgnoreCase(itemName));
    }

    public Item findItem(String itemName) {
        // Aquí tu código
        return this.items.stream()
                .filter(item -> item.getName().equalsIgnoreCase(itemName))
                .findFirst()
                .orElse(null);
    }

    public double getTotalWeight() {
        // Aquí tu código
        return this.items.stream()
                .mapToDouble(items -> items.getWeight())
                .sum(); // sustituye esto por el valor real
    }

    // Este getter no es necesario modificarlo
    public ArrayList<Item> getItems() {
        return items;
    }
}
