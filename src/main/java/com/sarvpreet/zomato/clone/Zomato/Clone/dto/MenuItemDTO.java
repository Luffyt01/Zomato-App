package com.sarvpreet.zomato.clone.Zomato.Clone.dto;

import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Menu;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.enums.MenuItemType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MenuItemDTO {

    private Long id;
    private String name;
    private String description;
    private MenuDTO menu;
    private Boolean isAvailable;
    private Double price;
    private Double rating;
    private MenuItemType type;
}
