package com.sarvpreet.zomato.clone.Zomato.Clone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignupDTO {

    private String email;
    private String name;
    private Long contact;
    private String password;
}
