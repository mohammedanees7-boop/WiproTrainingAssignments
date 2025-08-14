package com.controllers;


import com.pojos.Restaurant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class RestaurantController {

    @GetMapping("/restaurants")
    public List<Restaurant> getRestaurants() {
        return Arrays.asList(
            new Restaurant(1, "Spicy Villa", "New York"),
            new Restaurant(2, "Pasta Paradise", "Chicago"),
            new Restaurant(3, "Curry Corner", "San Francisco")
        );
    }
}
