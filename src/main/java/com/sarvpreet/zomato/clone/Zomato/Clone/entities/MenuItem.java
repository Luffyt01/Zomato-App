package com.sarvpreet.zomato.clone.Zomato.Clone.entities;

import com.sarvpreet.zomato.clone.Zomato.Clone.entities.enums.MenuItemType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    private Menu menu;
    private Boolean isAvailable;
    private Double price;
    private Double rating;

    @Enumerated(EnumType.STRING)
    private MenuItemType type;
}
