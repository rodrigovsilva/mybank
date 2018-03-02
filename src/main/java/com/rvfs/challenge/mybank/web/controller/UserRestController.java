package com.rvfs.challenge.mybank.web.controller;

import com.rvfs.challenge.mybank.dto.UserDTO;
import com.rvfs.challenge.mybank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * User Rest controller.
 *
 * @author rodrigovfsilva
 */
@RestController
@RequestMapping("/api/user")
public class UserRestController {

    @Autowired
    private UserService userService;


    @PostMapping("/signup")
    public ResponseEntity<Object> signup(@Valid @RequestBody UserDTO user) {

        UserDTO userResponseBody = userService.signup(user);

        ResponseEntity<Object> responseEntity = new ResponseEntity<>(userResponseBody, HttpStatus.CREATED);

        return responseEntity;

    }

}
