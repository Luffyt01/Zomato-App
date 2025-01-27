package com.sarvpreet.zomato.clone.Zomato.Clone.repositories;

import com.sarvpreet.zomato.clone.Zomato.Clone.entities.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
}
