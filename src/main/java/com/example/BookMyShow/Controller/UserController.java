package com.example.BookMyShow.Controller;

import com.example.BookMyShow.EntryDto.UserEntryDto;
import com.example.BookMyShow.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping
    public String addUser(@RequestBody UserEntryDto userEntryDto){
       return userService.addUser(userEntryDto);
    }

}
