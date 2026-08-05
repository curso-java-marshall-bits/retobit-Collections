package RetoArrayList;
import java.util.ArrayList;

public class Inventory {

    // ArrayList no guarda una copia del objeto sino la referencia al objeto
    private final ArrayList<Item> items = new ArrayList<>(); // Es una propiedad constante


    // Este es un metodo de Inventory que permite añadir Items
    // Inventario solo sirve para invocar al metodo
    public void addItem(Item item) {
        // item es solo una variable que apunta al mismo objeto sword
        items.add(item);
        // ArrayList items -> posicion 0 -> item:name = "Espada", weight = 10
    }



    // No comparas el objeto Item sino su nombre
    public boolean removeItem(String itemName) {
        for (Item item: items) {
            if (item.getName().equals(itemName)) {
                return items.remove(item); // duveulev un true al eliminar el objeto
                //return true;
            }
        }
        return false;
    }

    public Item findItem(String itemName) { // Está recibiendo una referencia a un objeto Item que ya existe.
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

        for(Item item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight; // sustituye esto por el valor real
    }

    // Este getter no es necesario modificarlo
    public ArrayList<Item> getItems() {
        return items;
    }
}