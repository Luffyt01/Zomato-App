package com.sarvpreet.zomato.clone.Zomato.Clone.repositories;

import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
}
