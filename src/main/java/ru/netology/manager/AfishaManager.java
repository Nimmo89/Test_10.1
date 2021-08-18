package ru.netology.manager;

import ru.netology.domain.Films;

public class AfishaManager {
    private Films[] films = new Films[0];
    private int maxLenght = 10;
    public Films[] getFilms() {
        int resultLength;
        if (maxLenght < 10) {
            resultLength = films.length - 1;
        } else {
            resultLength = 10;
        }
        Films[] result = new Films[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
    public void add(Films film) {
        // создаём новый массив размером на единицу больше
        int length = films.length + 1;
        Films[] tmp = new Films[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public void removeById(int id) {
        // наивная реализация
        int length = films.length - 1;
        Films[] tmp = new Films[length];
        int index = 0;
        for (Films item : films) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        films = tmp;
    }
        //    public Films[] getAll() {
//        Films[] result = new Films[films.length];
//        //перебираем массив в прямом порядке
//        //но кладём в результаты в обратном
//        for (int i = 0; i < result.length; i++) {
//            int index = films.length - i - 1;
//            result[i] = films[index];
//        }
//        return result;
//    }
}
