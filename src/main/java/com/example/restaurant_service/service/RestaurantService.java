package com.example.restaurant_service.service;

import com.example.restaurant_service.dao.RestaurantOrderDao;
import com.example.restaurant_service.dto.OrderResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {

    private final RestaurantOrderDao restaurantOrderDao;

    public RestaurantService(RestaurantOrderDao restaurantOrderDao){
        this.restaurantOrderDao = restaurantOrderDao;
    }
    public String greeting() {
        return "Welcome to Sweegy Resturant Service";
    }

    public OrderResponseDTO getOrder(String orderId) {
        return restaurantOrderDao.getOrder(orderId);
    }
}
