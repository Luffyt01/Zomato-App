package com.sarvpreet.zomato.clone.Zomato.Clone.repositories;

import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
