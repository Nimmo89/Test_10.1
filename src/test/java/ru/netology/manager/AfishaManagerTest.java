package ru.netology.manager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.domain.Films;
import ru.netology.repository.AfishaRepository;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class AfishaManagerTest {
    @Mock
    private AfishaRepository repository;
    @InjectMocks
    private AfishaManager manager;
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
        Films[] returned = new Films[]{f2, f4, f6, f8, f0};
        Mockito.doReturn(returned).when(repository).findAll();
        Films[] expected = new Films[]{f2, f4, f6, f8, f0};
        Films[] actual = manager.getAll();
        assertArrayEquals(expected,actual);
        Mockito.verify(repository).findAll();
    }

    @Test
    void getAll() {
        Films[] returned = new Films[]{f1, f3, f5, f7, f9, f11};
        Mockito.doReturn(returned).when(repository).findAll();
        Films[] expected = new Films[]{f1, f3, f5, f7, f9, f11};
        Films[] actual = manager.getAll();
        assertArrayEquals(expected,actual);
        Mockito.verify(repository).findAll();
    }

    @Test
    void findOver10() {
        Films[] returned = new Films[]{f0, f9, f8, f7, f6, f5, f4, f3, f2, f1};
        Mockito.doReturn(returned).when(repository).findAll();
        Films[] expected = new Films[]{f1, f2, f3, f4, f5, f6, f7, f8, f9, f0};
        Films[] actual = manager.findOver10();
        assertArrayEquals(expected,actual);
        Mockito.verify(repository).findAll();
    }

    @Test
    void findOver9() {
        Films[] returned = new Films[]{f11, f0, f9, f6, f3, f4, f5, f2, f1};
        Mockito.doReturn(returned).when(repository).findAll();
        Films[] expected = new Films[]{f1, f2, f5, f4, f3, f6, f9, f0, f11};
        Films[] actual = manager.findOver10();
        assertArrayEquals(expected,actual);
        Mockito.verify(repository).findAll();
    }

//    @Test
//    void removeById() {
//        Films[] returned = new Films[]{f1, f2, f3, f4, f5};
//        Mockito.doReturn(returned).when(repository).removeById(5);
//        Films[] expected = new Films[]{f1, f2, f3, f4};
//        Films[] actual = manager.getAll();
//        assertArrayEquals(expected,actual);
//        Mockito.verify(repository).findAll();
//    }
}