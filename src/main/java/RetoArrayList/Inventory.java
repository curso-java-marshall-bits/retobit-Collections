package RetoArrayList;
import java.util.ArrayList;

public class Inventory {
    private final ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public boolean removeItem(String itemName) {
        // Aquí tu código
       for(Item i : items){
           if(itemName.equalsIgnoreCase(i.getName())){
               items.remove(i);
               return true;
           }
           else{
               return false;
           }
       }
       return false;
    }

    public Item findItem(String itemName) {
        for(Item i : items){
            if(i.getName().equalsIgnoreCase(itemName)){
                return i;
            }
        }
        return null;
    }

    public double getTotalWeight() {
        // Aquí tu código
        double sum = 0;
        for(Item i : items){
            sum += i.getWeight();
        }
        return sum; // sustituye esto por el valor real
    }

    // Este getter no es necesario modificarlo
    public ArrayList<Item> getItems() {
        return items;
    }
}
