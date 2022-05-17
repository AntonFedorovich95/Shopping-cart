package pro.sky.shoppingcart.service;

import java.util.List;

public interface ShoppingServiceInterface {
    List<Integer> addItems(List<Integer> ids);
    List<Integer> getItemsListInTheCart();
}

