package RetoArrayList;

public class Main {
    public static void main(String[] args) {
        // creamos un inventario
        Inventory inventory = new Inventory();

        // Creamos un objeto (Item)

        Item sword = new Item("Espada", 10);

        inventory.addItem(sword); // sword es item, que está en Inventory
        inventory.addItem(new Item("Escudo", 20));

        Item valor = inventory.findItem("Escudo");
        System.out.println(valor.getName());

    }
}

