package com.brilliantmule.order.management;

import com.brilliantmule.order.management.model.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersApiDelegateImpl implements OrdersApiDelegate {

    /**
     * POST /orders : Create orders
     *
     * @param order Orders to create (optional)
     * @return Orders created successfully (status code 201)
     * @see OrdersApi#createOrders
     */
    @Override
    public ResponseEntity<Void> createOrders(List<Order> order) {
        if (order == null || order.isEmpty()) {
            System.out.println("Request is null or empty");
        } else {
            System.out.println("Request contains " + order.size() + " orders");
        }

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
