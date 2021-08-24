package ru.netology.repository;

import ru.netology.domain.Films;

public class AfishaRepository {
    private Films[] films = new Films[0];

    public void save(Films film) {
        Films[] tmp = new Films[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Films[] findAll() {
        return films;
    }

    public Films[] findById(int id) {
        Films[] result = new Films[1];
        int i = 0;
        for (Films film : films) {
            if (film.getId() == id) {
                result[i] = film;
                i++;
            }
        }
        return result;
    }

    public void removeById(int id) {
        int length = films.length - 1;
        Films[] tmp = new Films[length];
        int index = 0;
        for (Films film : films) {
            if (film.getId() != id) {
                tmp[index] = film;
                index++;
            }
        }
        films = tmp;
    }

    public void removeAll() {
        Films[] empty = new Films[0];
        films = empty;
    }
}
