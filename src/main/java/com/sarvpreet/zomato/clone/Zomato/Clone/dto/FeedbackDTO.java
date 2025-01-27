package com.sarvpreet.zomato.clone.Zomato.Clone.dto;

import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Customer;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.DeliveryPartner;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Restaurant;
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
public class FeedbackDTO {

    private Long id;
    private Integer deliveryRating;
    private String deliveryReview;
    private Integer restaurantRating;
    private String restaurantReview;
    private String customerReview;
    private Integer customerRating;
    private DeliveryPartnerDTO deliveryPartner;
    private RestaurantDTO restaurant;
    private CustomerDTO customer;
}
