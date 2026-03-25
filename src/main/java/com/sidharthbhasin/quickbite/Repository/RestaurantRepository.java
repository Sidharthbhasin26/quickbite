package com.sidharthbhasin.quickbite.Repository;

import com.sidharthbhasin.quickbite.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RestaurantRepository extends JpaRepository<Restaurant , Long> {

    Optional<Restaurant> findByOwnerId(Long ownerId);

    List<Restaurant> findByIsActiveTrue();

    List<Restaurant> findByCuisineIgnoreCase(String cuisine);
}
