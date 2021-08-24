package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Films;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {
    AfishaManager manager = new AfishaManager();
    Films first = new Films(1, 1, "Name 1", "12.25.21", "Type film 1", 150);
    Films second = new Films(2 , 2, "Name 2", "10.22.21", "Type film 2", 120);
    Films third = new Films(3, 3, "Name 3", "09.09.21", "Type film 2", 90);
    Films fo = new Films(4, 4, "Name 4", "08.08.21", "Type film 3", 180);

    @Test
    void add() {
    }

    @Test
    void getAll() {
    }

    @Test
    void findOver10() {
    }
}