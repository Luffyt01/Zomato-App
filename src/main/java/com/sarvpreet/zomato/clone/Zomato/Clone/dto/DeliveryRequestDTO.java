package com.sarvpreet.zomato.clone.Zomato.Clone.dto;

import com.sarvpreet.zomato.clone.Zomato.Clone.entities.CustomerOrder;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.enums.DeliveryRequestStatus;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
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
public class DeliveryRequestDTO {

    private Long id;
    private CustomerOrderDTO order;
    private Double grandTotal;
    private Integer estimatedPreparationTime;
    private DeliveryRequestStatus status;
    private PointDTO pickUpAddress;
    private PointDTO dropOffLocation;
    private LocalDateTime deliveryRequestedTime;
}
