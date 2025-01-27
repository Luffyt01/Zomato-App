package com.sarvpreet.zomato.clone.Zomato.Clone.repositories;

import com.sarvpreet.zomato.clone.Zomato.Clone.entities.DeliveryRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRequestRepository extends JpaRepository<DeliveryRequest, Long> {
}
