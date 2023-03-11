package com.example.book_my_show.Convertors;

import com.example.book_my_show.Entities.TheaterEntity;
import com.example.book_my_show.EntryDTOs.TheaterEntryDto;

public class TheaterConvertors {

    public static TheaterEntity convertDtoToEntity(TheaterEntryDto theaterEntryDto){

        return TheaterEntity.builder().location(theaterEntryDto.getLocation())
                .name(theaterEntryDto.getName()).build();

    }

}
