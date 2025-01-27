package com.sarvpreet.zomato.clone.Zomato.Clone.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.MenuItem;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Restaurant;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MenuDTO {

    private Long id;
    private List<MenuItemDTO> items;
    private RestaurantDTO restaurant;
    private Boolean isActive;
}
