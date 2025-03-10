package com.dk.Controller;

import com.dk.Entity.User;
import com.dk.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/welcome")
    public String getMap(){
        return "Welcome to Home page -> Today day 84";
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUser();
    }

    @GetMapping("/users/{id}")
    public Optional<User> getUserById(@PathVariable int id){
        return userService.getUsersById(id);
    }

    @PostMapping("/user")
    public User postUserDetails(@RequestBody User user){
        return userService.saveUser(user);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUserById(@PathVariable int id){
         userService.deleteUser(id);
         System.out.println("Deleted user Successfully");
    }

//    @PutMapping("/users/{id}")
//    public User updateUser(@PathVariable int id,@RequestBody User user){
//        return userService.updateUserDetails(id,user);
//    }
}
