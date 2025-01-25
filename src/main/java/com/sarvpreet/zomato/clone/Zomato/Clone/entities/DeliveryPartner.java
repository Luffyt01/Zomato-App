package com.sarvpreet.zomato.clone.Zomato.Clone.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.locationtech.jts.geom.Point;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DeliveryPartner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long aadharNo;
    private String vehicleId;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point currentLocation;
    private Double rating;
    private Boolean isAvailable;

    @ManyToOne
    @JoinColumn(name = "onboarding_admin_id", referencedColumnName = "id")
    @JsonIgnore
    private Admin onBoardedBy;
}
