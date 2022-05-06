package pro.sky.shoppingcart.controller;

import pro.sky.shoppingcart.data.Cart;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.shoppingcart.service.ShoppingServiceInterface;

import java.util.ArrayList;

@RestController
public class ShoppingCartController {
    private final ShoppingServiceInterface shoppingServiceInterface;

    public ShoppingCartController(ShoppingServiceInterface orderServiceInterface) {
        this.shoppingServiceInterface = orderServiceInterface;
    }

    @GetMapping("/add")
    public Cart createNewCart(@RequestParam ArrayList<Integer> items) {
        return shoppingServiceInterface.addItemsToCart(items);
    }

    @GetMapping("/get")
    public ArrayList<Integer> showItemsInTheCart() {
        return shoppingServiceInterface.getItemsListInTheCart();
    }
}