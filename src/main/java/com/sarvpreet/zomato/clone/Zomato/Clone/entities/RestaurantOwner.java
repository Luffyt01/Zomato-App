package com.sarvpreet.zomato.clone.Zomato.Clone.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class RestaurantOwner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long aadharNo;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @OneToOne
    private Restaurant restaurant;

    @ManyToOne
    @JoinColumn(name = "added_by_admin_id", referencedColumnName = "id")
    @JsonIgnore
    private Admin addedBy;
}
