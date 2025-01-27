package com.sarvpreet.zomato.clone.Zomato.Clone.dto;

import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Menu;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.RestaurantOwner;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.enums.RestaurantType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantDTO {

    private Long id;
    private String name;
    private String description;
    private RestaurantOwnerDTO owner;
    private List<MenuDTO> menus;
    private RestaurantType type;
    private Double rating;
    private Boolean isOpen;
}
