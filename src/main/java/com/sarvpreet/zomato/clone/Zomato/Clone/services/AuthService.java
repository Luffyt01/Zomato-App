package com.sarvpreet.zomato.clone.Zomato.Clone.services;

import com.sarvpreet.zomato.clone.Zomato.Clone.dto.SignupDTO;
import com.sarvpreet.zomato.clone.Zomato.Clone.dto.UserDTO;

public interface AuthService {

    String[] login(String email, String password);

    UserDTO signup(SignupDTO signupDTO);
}
