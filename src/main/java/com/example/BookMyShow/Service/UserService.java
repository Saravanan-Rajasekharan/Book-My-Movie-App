package com.example.BookMyShow.Service;

import com.example.BookMyShow.EntryDto.UserEntryDto;
import com.example.BookMyShow.Model.User;
import com.example.BookMyShow.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String addUser(UserEntryDto userEntryDto){
        // We need to convert and save
        /*
            Old method: Create an object and set attributes.
         */

        User user = User.builder().age(userEntryDto.getAge()).name(userEntryDto.getName())
                .address(userEntryDto.getAddress()).email(userEntryDto.getEmail()).mobNo(userEntryDto.getMobNo())
                .build();

        //This is to set all attributes in one go...
        userRepository.save(user);
        return "User data Saved!";
    }




}
