package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@NoArgsConstructor
//@AllArgsConstructor
@Data
public class Films {
    private int id;
    private int filmId;
    private String filmName;
    private String filmDateOpen;
    private String filmType;
    private int filmTime;

    public Films(int id, int filmId, String filmName, String filmDateOpen, String filmType, int filmTime) {
        this.id = id;
        this.filmId = filmId;
        this.filmName = filmName;
        this.filmDateOpen = filmDateOpen;
        this.filmType = filmType;
        this.filmTime = filmTime;
    }
}
