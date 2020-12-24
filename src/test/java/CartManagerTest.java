import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class CartManagerTestNonEmpty {
    CartManager cartManager = new CartManager();
    PurchaseItems first = new PurchaseItems(1, 1, "first", 1, 1);
    PurchaseItems second = new PurchaseItems(2, 2, "second", 1, 1);
    PurchaseItems third = new PurchaseItems(3, 3, "third", 1, 1);

    @BeforeEach
    public void setUo(){
        cartManager.add(first);
        cartManager.add(second);
        cartManager.add(third);
    }

    @Test
    public void shouldNotRemoveIfExists(){
        int idToRemove = 1;

        cartManager.removeById(idToRemove);

        PurchaseItems[] actual = cartManager.getAll();
        PurchaseItems[] expected = new PurchaseItems[]{third, second};

        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldNotRemoveIfNotExists(){
        int idToRemove = 2;
        cartManager.removeById(idToRemove);

        PurchaseItems[] actual = cartManager.getAll();
        PurchaseItems[] expected = new PurchaseItems[]{third, first};

        assertArrayEquals(expected, actual);
    }
}