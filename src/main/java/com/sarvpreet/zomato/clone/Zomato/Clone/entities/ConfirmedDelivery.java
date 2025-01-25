package com.sarvpreet.zomato.clone.Zomato.Clone.entities;

import com.sarvpreet.zomato.clone.Zomato.Clone.entities.enums.ConfirmedDeliveryStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ConfirmedDelivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private DeliveryRequest deliveryRequest;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "delivery_partner_id")
    private DeliveryPartner deliveryPartner;
    private String pickupOtp;
    private Double distance;
    private Integer estimatedTime;

    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point pickUpAddress;

    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point dropOffLocation;

    @CreationTimestamp
    private LocalDateTime deliveryAcceptedTime;
    private LocalDateTime deliveryCompleteTime;

    @Enumerated(EnumType.STRING)
    private ConfirmedDeliveryStatus status;
}
