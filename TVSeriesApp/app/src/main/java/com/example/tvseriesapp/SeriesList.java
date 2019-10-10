package com.example.tvseriesapp;

import java.util.ArrayList;
import java.util.List;

public class SeriesList {
    List<String> getListTV (String spinner) {
        List<String> list = new ArrayList<>();
        switch (spinner) {
            case "Комедии":
                list.add("Друзья");
                break;
            case "Фэнтези":
                list.add("Игра престолов");
                break;
            case "Ужасы":
                list.add("Ходячие мертвецы");
                break;
            case "Фантастика":
                list.add("Футурама");
                break;
            case "Криминал":
                list.add("Во все тяжкие");
                list.add("Менталист");
                break;
            case "Мелодрамы":
                list.add("Секс в большом городе");
                break;
        }
        /*if (spinner.equals("Комедии")) {
            list.add("Друзья");
        }
        if (spinner.equals("Фэнтези")) {
            list.add("Игра престолов");
        }
        if (spinner.equals("Ужасы")) {
            list.add("Ходячие мертвецы");
        }
        if (spinner.equals("Фантастика")) {
            list.add("Футурама");
        }
        if (spinner.equals("Криминал")) {
            list.add("Во все тяжкие");
        }
        if (spinner.equals("Мелодрамы")) {
            list.add("Секс в большом городе");
        }*/
        return list;
    }
}
