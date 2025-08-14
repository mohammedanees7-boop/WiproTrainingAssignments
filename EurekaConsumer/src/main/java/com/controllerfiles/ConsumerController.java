package com.controllerfiles;


import com.example.client.RestaurantClient;
import com.pojos.Restaurant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsumerController {

    private final RestaurantClient restaurantClient;

    public ConsumerController(RestaurantClient restaurantClient) {
        this.restaurantClient = restaurantClient;
    }

    @GetMapping("/consumer/restaurants")
    public List<Restaurant> getRestaurantsFromProducer() {
        return restaurantClient.getRestaurants();
    }
}
