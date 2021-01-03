package legend2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)

public class AfishaManagerTest {
@Mock
    private AfishaRepository repository;
@InjectMocks
    private AfishaManager manager;
    private PurchaseItems film1 = new PurchaseItems(1, 1, "film1", 1, 1);
    private PurchaseItems film2 = new PurchaseItems(2, 1, "film2", 1, 1);
    private PurchaseItems film3 = new PurchaseItems(3, 1, "film3", 1, 1);

    @Test
    void removeById() {
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);


        PurchaseItems[] returned = new PurchaseItems[]{film1, film2, film3};
        doReturn(returned).when(repository).findAll();
        doNothing().when(repository).removeById(0);

        manager.removeById(0);
        PurchaseItems[] actual = manager.reverse();
        PurchaseItems[] expected = new PurchaseItems[]{film2, film3};
        assertArrayEquals(expected, actual);
        verify(repository).removeById(5);
    }
}