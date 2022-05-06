package pro.sky.shoppingcart.service;

import pro.sky.shoppingcart.data.Cart;

import java.util.ArrayList;

public interface ShoppingServiceInterface {
    Cart addItemsToCart(ArrayList<Integer> items);
    ArrayList<Integer> getItemsListInTheCart();
}
