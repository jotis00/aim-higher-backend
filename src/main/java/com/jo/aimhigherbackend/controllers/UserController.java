package com.jo.aimhigherbackend.controllers;

import com.jo.aimhigherbackend.models.User;
import com.jo.aimhigherbackend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/user")
public class UserController {
    //User
    @Autowired
    private UserRepository userRepo;
    //get

    private String username;

    @GetMapping("/returnuser")
    public User returnUser() {
        return userRepo.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
    //update
    @PutMapping("/updatesubstatus/{subStatus}")
    public Boolean updateSubscriptionStatus(@Valid @PathVariable Boolean subStatus) {

        //get current logged in user
        return subStatus;
    }
    //delete user
    @DeleteMapping("/delete")
    public ResponseEntity<HttpStatus> deleteUser() {
        //get current logged in user_id
        Long userId = 15000000000L;

        try {
            userRepo.deleteById(userId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    //friend
    @GetMapping("/friends")
    public Set<String> getFriends() {
        Set<String> friendList = new HashSet<>();
        //get current user
        //get friends id
        //get friends users
        //send back friend usernames
        return friendList;
    }

    //add friend
    @PutMapping("/updatefriends/{username}")
    public ResponseEntity<HttpStatus> updateFriends(@Valid @PathVariable String friendUsername) {
        //get current user
        //get friend user
        //get current user friends
        //add friends to current user
        //save user
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
    //delete friend
    @DeleteMapping("/deletefriend/{username}")
    public ResponseEntity<HttpStatus> deleteFriend(@Valid @PathVariable String friendUsername) {
        //get current user
        //get friend user
        //get current user Friends
        //delete friend user from current user
        //save user
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
