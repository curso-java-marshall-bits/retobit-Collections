package RetoArrayList;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class InventoryTest {

    @Test
    @Order(1)
    @DisplayName("Añadir item incrementa tamaño del inventario")
    void testAddItemIncreasesSize() {
        Inventory inv = new Inventory();
        inv.addItem(new Item("Espada", 5.0));
        assertEquals(1, inv.getItems().size(),
                "❌ El inventario debe tener 1 item después de añadirlo");
    }

    @Test
    @Order(2)
    @DisplayName("Eliminar item existente retorna true")
    void testRemoveExistingItem() {
        Inventory inv = new Inventory();
        inv.addItem(new Item("Escudo", 8.0));
        assertTrue(inv.removeItem("Escudo"),
                "❌ removeItem() debe retornar true al eliminar un item existente");
    }

    @Test
    @Order(3)
    @DisplayName("Eliminar item inexistente retorna false")
    void testRemoveNonExistingItem() {
        Inventory inv = new Inventory();
        inv.addItem(new Item("Arco", 3.0));
        assertFalse(inv.removeItem("Daga"),
                "❌ removeItem() debe retornar false para items no existentes");
    }

    @Test
    @Order(4)
    @DisplayName("Buscar item existente retorna el objeto correcto")
    void testFindExistingItem() {
        Inventory inv = new Inventory();
        Item expected = new Item("Poción", 0.5);
        inv.addItem(expected);
        Item found = inv.findItem("Poción");
        assertEquals(expected, found,
                "❌ findItem() debe retornar el objeto Item cuando existe");
    }

    @Test
    @Order(5)
    @DisplayName("Buscar item inexistente retorna null")
    void testFindNonExistingItem() {
        Inventory inv = new Inventory();
        assertNull(inv.findItem("Varita"),
                "❌ findItem() debe retornar null para items no encontrados");
    }

    @Test
    @Order(6)
    @DisplayName("Peso total suma correctamente los items")
    void testTotalWeightCalculation() {
        Inventory inv = new Inventory();
        inv.addItem(new Item("Libro", 1.0));
        inv.addItem(new Item("Gema", 0.2));
        assertEquals(1.2, inv.getTotalWeight(), 0.01,
                "❌ getTotalWeight() debe sumar el peso de todos los items");
    }
}