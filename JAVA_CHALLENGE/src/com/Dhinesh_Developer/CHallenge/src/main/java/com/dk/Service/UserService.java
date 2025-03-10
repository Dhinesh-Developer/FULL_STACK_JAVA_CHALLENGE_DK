package com.dk.Service;

import com.dk.Entity.User;
import com.dk.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUser() {
        return  userRepository.findAll();
    }

    public Optional<User> getUsersById(int id) {
        return userRepository.findById(id);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(int id) {
         userRepository.deleteById(id);
    }

//    public User updateUserDetails(int id, User user) {
//        User user1 = userRepository.findById(id);
//        user1.setName(user1.getName());
//        user1.setPasswd(user1.getPasswd());
//        return userRepository.save(user1);
//    }
}
