package legend1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PosterManagerTest {
    PurchaseItems first = new PurchaseItems(1, 1, "first", 1, 1);
    PurchaseItems second = new PurchaseItems(2, 2, "second", 1, 1);
    PurchaseItems third = new PurchaseItems(3, 3, "third", 1, 1);
    PurchaseItems film4 = new PurchaseItems(4, 4, "film4", 1, 1);
    PurchaseItems film5 = new PurchaseItems(5, 5, "film5", 1, 1);
    PurchaseItems film6 = new PurchaseItems(6, 6, "film6", 1, 1);
    PurchaseItems film7 = new PurchaseItems(7, 7, "film7", 1, 1);
    PurchaseItems film8 = new PurchaseItems(8, 8, "film8", 1, 1);
    PurchaseItems film9 = new PurchaseItems(9, 9, "film9", 1, 1);
    PurchaseItems film10 = new PurchaseItems(10, 10, "film10", 1, 1);
    PurchaseItems film11 = new PurchaseItems(11, 11, "film11", 1, 1);


    @Test
    public void showFilmsLent_countFilms_4() {
        PosterManager posterManager = new PosterManager(4);
        posterManager.add(first);
        posterManager.add(second);
        posterManager.add(third);
        posterManager.add(film4);

        posterManager.getLastFilms();
        PurchaseItems[] actual = posterManager.getLastFilms();
        PurchaseItems[] expected = new PurchaseItems[]{film4, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void showFilmsLent_countFilms_11() {
        PosterManager posterManager = new PosterManager(11);
        posterManager.add(first);
        posterManager.add(second);
        posterManager.add(third);
        posterManager.add(film4);
        posterManager.add(film5);
        posterManager.add(film6);
        posterManager.add(film7);
        posterManager.add(film8);
        posterManager.add(film9);
        posterManager.add(film10);
        posterManager.add(film11);

        posterManager.getLastFilms();
        PurchaseItems[] actual = posterManager.getLastFilms();
        PurchaseItems[] expected = new PurchaseItems[]{film11, film10, film9, film8, film7, film6, film5, film4, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void showFilmsLent_countFilms_Default() {
        PosterManager posterManager = new PosterManager();
        posterManager.add(first);
        posterManager.add(second);
        posterManager.add(third);
        posterManager.add(film4);
        posterManager.add(film5);
        posterManager.add(film6);
        posterManager.add(film7);
        posterManager.add(film8);
        posterManager.add(film9);
        posterManager.add(film10);

        posterManager.getLastFilms();
        PurchaseItems[] actual = posterManager.getLastFilms();
        PurchaseItems[] expected = new PurchaseItems[]{film10, film9, film8, film7, film6, film5, film4, third, second, first};

        assertArrayEquals(expected, actual);
    }

}