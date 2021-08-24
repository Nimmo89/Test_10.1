package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Films;

import static org.junit.jupiter.api.Assertions.*;

class AfishaRepositoryTest {
    AfishaRepository repository = new AfishaRepository();
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
    void save() {
        repository.save(f1);
        repository.save(f2);
        repository.save(f5);
        repository.save(f4);

        Films[] expected = new Films[]{f1, f2, f5, f4};
        Films[] actual = repository.findAll();
        assertArrayEquals(expected,actual);
    }

    @Test
    void findAll() {
        repository.save(f1);
        repository.save(f2);
        repository.save(f3);
        repository.save(f4);
        repository.save(f5);
        repository.save(f6);
        repository.save(f7);
        repository.save(f8);
        repository.save(f9);
        repository.save(f0);
        repository.save(f11);

        Films[] expected = new Films[]{f1, f2, f3, f4, f5, f6, f7, f8, f9, f0, f11};
        Films[] actual = repository.findAll();
        assertArrayEquals(expected,actual);
    }

    @Test
    void findById() {
        repository.save(f1);
        repository.save(f2);
        repository.save(f3);
        repository.save(f4);
        repository.save(f5);

        repository.findById(3);

        Films[] expected = new Films[]{f3};
        Films[] actual = repository.findById(3);
        assertArrayEquals(expected,actual);
    }

    @Test
    void removeById() {
        repository.save(f1);
        repository.save(f2);
        repository.save(f3);
        repository.save(f4);
        repository.save(f5);

        repository.removeById(5);

        Films[] expected = new Films[]{f1, f2, f3, f4};
        Films[] actual = repository.findAll();
        assertArrayEquals(expected,actual);
    }

    @Test
    void removeAll() {
        repository.save(f1);
        repository.save(f2);
        repository.save(f3);

        repository.removeAll();

        Films[] expected = new Films[0];
        Films[] actual = repository.findAll();
        assertArrayEquals(expected,actual);
    }
}