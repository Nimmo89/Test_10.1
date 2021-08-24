package ru.netology.manager;

import ru.netology.domain.Films;

public class AfishaManager {
    private Films[] films = new Films[0];
    private int maxLenght = 10;

    public AfishaManager(int maxLenght) {
        this.maxLenght = maxLenght;
    }

    public AfishaManager() {
    }

    public void add(Films film) {
        Films[] tmp = new Films[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

//    public void removeById(int id) {
//        // наивная реализация
//        int length = films.length - 1;
//        Films[] tmp = new Films[length];
//        int index = 0;
//        for (Films item : films) {
//            if (item.getId() != id) {
//                tmp[index] = item;
//                index++;
//            }
//        }
//        films = tmp;
//    }
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
