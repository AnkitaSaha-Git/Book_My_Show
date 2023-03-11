package com.example.book_my_show.EntryDTOs;


import com.example.book_my_show.Enums.Genre;
import com.example.book_my_show.Enums.Language;

import lombok.Data;

@Data
public class MovieEntryDto {

    private String movieName;

    private double ratings;

    private int duration;

    private Language language;

    private Genre genre;

}