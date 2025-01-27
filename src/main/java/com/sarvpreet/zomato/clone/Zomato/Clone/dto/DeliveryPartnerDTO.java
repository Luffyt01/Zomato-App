package com.sarvpreet.zomato.clone.Zomato.Clone.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Admin;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.User;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.locationtech.jts.geom.Point;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryPartnerDTO {

    private Long id;
    private Long aadharNo;
    private String vehicleId;
    private UserDTO user;
    private PointDTO currentLocation;
    private Double rating;
    private Boolean isAvailable;
    private AdminDTO onBoardedBy;
}
