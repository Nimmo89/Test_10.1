package ru.netology.manager;

import ru.netology.domain.Films;
import ru.netology.repository.AfishaRepository;

public class AfishaManager {
    private AfishaRepository repository;
    private int maxLenght = 10;

    public void add(Films film) {
        repository.save(film);
    }

    public Films[] getAll() {
        Films[] films = repository.findAll();
        Films[] result = new Films[films.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = films[i];
        }
        return result;
    }

    public Films[] findOver10() {
        Films[] films = repository.findAll();
        int resultLength;
        if (films.length < maxLenght) {
            resultLength = films.length;
        } else {
            resultLength = maxLenght;
        }
        Films[] result = new Films[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = resultLength - 1 - i;
            result[i] = films[index];
        }
        return result;
    }

    public void removeById(int id) {
        repository.removeById(id);
    }
}
