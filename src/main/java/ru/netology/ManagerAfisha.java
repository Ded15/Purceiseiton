package ru.netology;

public class ManagerAfisha {

    private String[] film = new String[0];
    private int limit;

    public ManagerAfisha(int limit) {
        this.limit = limit;
    }

    public ManagerAfisha() {
        this.limit = 10;
    }

    public void add(String fims) { //добавление фильмов
        String[] tmp = new String[film.length + 1];
        for (int i = 0; i < film.length; i++) {
            tmp[i] = film[i];
        }
        tmp[tmp.length - 1] = fims;
        film = tmp;
    }

    public String[] findAll() { //показать все

        return film;
    }

    public String[] findLast() { //последних добавленных фильмов в обратном от добавления порядке
        int arrayLength;
        if (film.length < limit) {
            arrayLength = film.length;
        } else {
            arrayLength = 10;
        }
        String[] tmp = new String[arrayLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = film[film.length - 1 - i];
        }
        return tmp;
    }
}


