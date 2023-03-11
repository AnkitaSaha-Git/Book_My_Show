package com.example.book_my_show.Convertors;

import com.example.book_my_show.Entities.ShowEntity;
import com.example.book_my_show.EntryDTOs.ShowEntryDto;

public class ShowConvertors {


    public static ShowEntity convertEntryToEntity(ShowEntryDto showEntryDto){

        ShowEntity showEntity = ShowEntity.builder()
                .showDate(showEntryDto.getLocalDate())
                .showTime(showEntryDto.getLocalTime())
                .showType(showEntryDto.getShowType())
                .build();

        return showEntity;
    }
}