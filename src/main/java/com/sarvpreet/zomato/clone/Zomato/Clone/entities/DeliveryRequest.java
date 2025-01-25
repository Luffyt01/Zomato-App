package com.sarvpreet.zomato.clone.Zomato.Clone.entities;

import com.sarvpreet.zomato.clone.Zomato.Clone.entities.enums.DeliveryRequestStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DeliveryRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private CustomerOrder order;
    private Double grandTotal;
    private Integer estimatedPreparationTime;

    @Enumerated(EnumType.STRING)
    private DeliveryRequestStatus status;

    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point pickUpAddress;

    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point dropOffLocation;
    private LocalDateTime deliveryRequestedTime;
}
