package com.example.book_my_show.Convertors;

import com.example.book_my_show.Entities.UserEntity;
import com.example.book_my_show.EntryDTOs.UserEntryDto;

public class UserConvertor {

    public static UserEntity convertDTOToEntity(UserEntryDto userEntryDTO){
        UserEntity userEntity= UserEntity.builder().age(userEntryDTO.getAge()).address(userEntryDTO.getAddress()).email(userEntryDTO.getEmail()).name(userEntryDTO.getName()).mobNo(userEntryDTO.getMobNo()).build();

        return  userEntity;
    }
}
