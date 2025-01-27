package com.sarvpreet.zomato.clone.Zomato.Clone.services.impl;

import com.sarvpreet.zomato.clone.Zomato.Clone.dto.SignupDTO;
import com.sarvpreet.zomato.clone.Zomato.Clone.dto.UserDTO;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.User;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.enums.Role;
import com.sarvpreet.zomato.clone.Zomato.Clone.exceptions.RuntimeConflictException;
import com.sarvpreet.zomato.clone.Zomato.Clone.repositories.UserRepository;
import com.sarvpreet.zomato.clone.Zomato.Clone.services.AuthService;
import com.sarvpreet.zomato.clone.Zomato.Clone.services.CustomerService;
import com.sarvpreet.zomato.clone.Zomato.Clone.services.WalletService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final CustomerService customerService;
    private final WalletService walletService;


    @Override
    public String[] login(String email, String password) {
        return new String[0];
    }

    @Override
    public UserDTO signup(SignupDTO signupDTO) {
        // Checking if the user already exists
        User user = userRepository.findByEmail(signupDTO.getEmail()).orElse(null);

        // if user already exists then throws exception
        if (user != null){
            throw new RuntimeConflictException("Cannot signup, User already exists with email"+ signupDTO.getEmail());
        }

        User mappedUser = modelMapper.map(signupDTO, User.class);
        mappedUser.setRoles(Set.of(Role.CUSTOMER));

        User savedUser = userRepository.save(mappedUser);

        // Create Customer
        customerService.createNewCustomer(savedUser);

        // Create wallet for the customer
        walletService.createNewWallet(savedUser);

        return modelMapper.map(savedUser, UserDTO.class);
    }
}
