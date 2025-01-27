package com.sarvpreet.zomato.clone.Zomato.Clone.dto;

import com.sarvpreet.zomato.clone.Zomato.Clone.entities.DeliveryPartner;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.DeliveryRequest;
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
public class ConfirmedDeliveryDTO {

    private Long id;
    private DeliveryRequestDTO deliveryRequest;
    private DeliveryPartnerDTO deliveryPartner;
    private String pickupOtp;
    private Double distance;
    private Integer estimatedTime;
    private PointDTO pickUpAddress;
    private PointDTO dropOffLocation;
    private LocalDateTime deliveryAcceptedTime;
    private LocalDateTime deliveryCompleteTime;
    private ConfirmedDeliveryStatus status;
}
