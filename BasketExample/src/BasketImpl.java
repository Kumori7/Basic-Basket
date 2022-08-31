import java.util.ArrayList;
import java.util.List;

public class BasketImpl implements Basket {

    private Product product;

    private int totalPrice = 0;

    private List<Product> basketCart = new ArrayList<>();

    @Override
    public void addToBasket(Product product) {

        // System.out.println("basket start: " + basket);

        basketCart.add(product);

        totalPrice += product.getProductPrice();

        // System.out.println("basket with items added: " + basketCart);

    } // end of addToBasket

    @Override
    public void viewBasket() {

        for (Product p : basketCart) {

            System.out.println(p.toString());
        }

    } // end of viewBasket

    @Override
    public void removeItemFromBasket(Product product) {

        if (basketCart.size() == 0) {
            System.out.println("The basket is empty we cannot remove a item!");
        }

        if (basketCart.contains(product)) {

            System.out.println("product: " + product.getProductName()
                    + " has been removed from basket");

            totalPrice = totalPrice - product.getProductPrice();

            basketCart.remove(product);

            System.out.println("current basket after removing item: " + basketCart);
        } else {

            System.out.println("basket does not contain: '" + product.getProductName() + "' item");
        }

    } // end of removeItemFromBasket

    @Override
    public int getTotalPrice() {

        return totalPrice;

    } // end of getTotalPrice

    @Override
    public int totalItemCount() {

        return basketCart.size();

    } // end of totalItemCount

} // end of BasketImpl class
