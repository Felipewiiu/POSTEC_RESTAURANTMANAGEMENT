package com.fiap.restaurant_management.infra.persistence.repository;

import com.fiap.restaurant_management.infra.persistence.entities.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Long> {
    Optional<RestaurantEntity> findByName(String name);
}
