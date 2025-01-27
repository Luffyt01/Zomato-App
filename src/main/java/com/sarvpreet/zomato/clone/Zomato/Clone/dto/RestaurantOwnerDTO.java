package com.sarvpreet.zomato.clone.Zomato.Clone.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Admin;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Restaurant;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.User;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantOwnerDTO {

    private Long id;
    private Long aadharNo;
    private UserDTO user;
    private RestaurantDTO restaurant;
    private AdminDTO addedBy;
}
