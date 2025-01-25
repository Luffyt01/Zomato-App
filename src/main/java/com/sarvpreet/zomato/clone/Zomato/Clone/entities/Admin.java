package com.sarvpreet.zomato.clone.Zomato.Clone.entities;

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
@Entity
public class Admin {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "addedBy", fetch = FetchType.LAZY)
    private List<RestaurantOwner> restaurantOwners;

    @OneToMany(mappedBy = "onBoardedBy", fetch = FetchType.LAZY)
    private List<DeliveryPartner> deliveryPartners;
}
