package com.example.book_my_show.Service;

import com.example.book_my_show.Convertors.UserConvertor;
import com.example.book_my_show.Entities.UserEntity;
import com.example.book_my_show.EntryDTOs.UserEntryDto;
import com.example.book_my_show.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String addUser(UserEntryDto userEntryDTO) throws Exception{
        UserEntity userEntity= UserConvertor.convertDTOToEntity(userEntryDTO);
        userRepository.save(userEntity);
        return "User added successfully";
    }
}
