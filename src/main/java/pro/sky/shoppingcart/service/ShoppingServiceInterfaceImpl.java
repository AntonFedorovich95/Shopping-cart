package pro.sky.shoppingcart.service;

import pro.sky.shoppingcart.data.Cart;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ShoppingServiceInterfaceImpl implements ShoppingServiceInterface {
    private final Cart cart;

    public ShoppingServiceInterfaceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public List<Integer> addItems(List<Integer> idlist) {
        return cart.addItems(idlist);
    }

    @Override
    public List<Integer> getItemsListInTheCart() {

        return cart.getItems();
    }

}

