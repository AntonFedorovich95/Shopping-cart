package pro.sky.shoppingcart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.shoppingcart.service.ShoppingServiceInterfaceImpl;

import java.util.List;

@RestController
@RequestMapping("/order")
public class ShoppingCartController {
    private final ShoppingServiceInterfaceImpl shoppingServiceInterfaceImpl;

    public ShoppingCartController(ShoppingServiceInterfaceImpl orderServiceInterfaceImpl) {
        this.shoppingServiceInterfaceImpl = orderServiceInterfaceImpl;
    }

    @GetMapping("/add")
    public List<Integer> addItems(@RequestParam List<Integer> ids) {
        return shoppingServiceInterfaceImpl.addItems(ids);
    }

    @GetMapping("/get")
    public List<Integer> showItemsInTheCart() {
        return shoppingServiceInterfaceImpl.getItemsListInTheCart();
    }
}
