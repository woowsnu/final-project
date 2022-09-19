package com.restaurant.app.repository;


import com.restaurant.app.model.RestaurantLike;
import com.restaurant.app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface RestaurantLikeRepository extends JpaRepository<RestaurantLike, Long> {
    @Transactional
    List<RestaurantLike> findAll();

    List<RestaurantLike> findRestaurantsLikeByUser(User user);

    @Transactional

    List<RestaurantLike> findRestaurantsLikeByUserEmail(String email);

    List<RestaurantLike> findRestaurantsLikeByRestaurantBusId(String busId);


}
