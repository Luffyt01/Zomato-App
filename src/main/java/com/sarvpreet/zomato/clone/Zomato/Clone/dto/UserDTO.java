package com.sarvpreet.zomato.clone.Zomato.Clone.dto;

import com.sarvpreet.zomato.clone.Zomato.Clone.entities.enums.Role;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {


    private String name;
    private String email;
    private Long contact;
    private Set<Role> roles;
}
