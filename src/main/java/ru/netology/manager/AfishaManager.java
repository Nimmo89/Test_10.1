package ru.netology.manager;

import ru.netology.domain.Films;

public class AfishaManager {
    private Films[] films = new Films[0];
    private int maxLenght = 10;

    public void add(Films film) {
        Films[] tmp = new Films[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Films[] getAll() {
        Films[] result = new Films[films.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = films[i];
        }
        return result;
    }

    public Films[] findOver() {
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

    public AfishaManager() {
    }
}
