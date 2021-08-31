package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Films;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {
    private AfishaManager manager1 = new AfishaManager(5);
    private AfishaManager manager = new AfishaManager();
    Films f1 = new Films(1, 1, "Name1", "12.25.21", "TypeFilm1", 150);
    Films f2 = new Films(2, 2, "Name2", "10.22.21", "TypeFilm2", 120);
    Films f3 = new Films(3, 3, "Name3", "09.09.21", "TypeFilm2", 90);
    Films f4 = new Films(4, 4, "Name4", "08.08.21", "TypeFilm3", 180);
    Films f5 = new Films(5, 5, "Name5", "04.02.21", "TypeFilm3", 110);
    Films f6 = new Films(6, 6, "Name6", "05.05.21", "TypeFilm4", 170);
    Films f7 = new Films(7, 7, "Name7", "03.08.21", "TypeFilm4", 190);
    Films f8 = new Films(8, 8, "Name8", "04.02.21", "TypeFilm5", 160);
    Films f9 = new Films(9, 9, "Name9", "01.01.21", "TypeFilm5", 140);
    Films f0 = new Films(10, 10, "Name10", "07.04.21", "TypeFilm1", 130);
    Films f11 = new Films(11, 11, "Name11", "27.25.21", "TypeFilm6", 200);

    @Test
    void add() {
        manager.add(f1);
        manager.add(f2);
        manager.add(f5);
        manager.add(f4);

        Films[] expected = new Films[]{f1, f2, f5, f4};
        Films[] actual = manager.getAll();
        assertArrayEquals(expected,actual);
    }

    @Test
    void getAll() {
        manager.add(f1);
        manager.add(f3);
        manager.add(f5);
        manager.add(f7);
        manager.add(f9);
        manager.add(f11);

        Films[] expected = new Films[]{f1, f3, f5, f7, f9, f11};
        Films[] actual = manager.getAll();
        assertArrayEquals(expected,actual);
    }

    @Test
    void findOver10() {
        manager.add(f1);
        manager.add(f2);
        manager.add(f3);
        manager.add(f4);
        manager.add(f5);
        manager.add(f6);
        manager.add(f7);
        manager.add(f8);
        manager.add(f9);
        manager.add(f0);
        manager.add(f11);

        Films[] expected = new Films[]{f0, f9, f8, f7, f6, f5, f4, f3, f2, f1};
        Films[] actual = manager.findOverMaxLenght();
        assertArrayEquals(expected,actual);
    }

    @Test
    void findOver9() {
        manager.add(f1);
        manager.add(f2);
        manager.add(f3);
        manager.add(f4);
        manager.add(f5);
        manager.add(f6);
        manager.add(f7);
        manager.add(f8);
        manager.add(f9);

        Films[] expected = new Films[]{f9, f8, f7, f6, f5, f4, f3, f2, f1};
        Films[] actual = manager.findOverMaxLenght();
        assertArrayEquals(expected,actual);
    }

    @Test
    void getAllOver5() {
        manager1.add(f1);
        manager1.add(f3);
        manager1.add(f5);
        manager1.add(f7);
        manager1.add(f9);
        manager1.add(f11);

        Films[] expected = new Films[]{f9, f7, f5, f3, f1};
        Films[] actual = manager1.findOverMaxLenght();
        assertArrayEquals(expected,actual);
    }

    @Test
    void getAll4() {
        manager1.add(f1);
        manager1.add(f3);
        manager1.add(f5);
        manager1.add(f7);

        Films[] expected = new Films[]{f7, f5, f3, f1};
        Films[] actual = manager1.findOverMaxLenght();
        assertArrayEquals(expected,actual);
    }
}