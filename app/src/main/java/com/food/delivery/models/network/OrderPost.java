package com.food.delivery.models.network;

import java.util.ArrayList;

public class OrderPost {
    final String delivery_address;
    final String payment_type;
    final ArrayList<Food> cart;

    public OrderPost(String delivery_address, String payment_type, ArrayList<Food> cart) {
        this.delivery_address = delivery_address;
        this.payment_type = payment_type;
        this.cart = cart;
    }
}
