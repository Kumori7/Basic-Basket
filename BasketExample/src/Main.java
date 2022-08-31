public class Main {

    static  Basket basket = new BasketImpl();

    public static void main(String[] args) {

        basketOperations();

    } // end of Main method

    public static void basketOperations() {

        Product p0 = new Product("Test", 55);
        Product p1 = new Product("Potato", 5);
        Product p2 = new Product("Tea", 7);
        Product p3 = new Product("Cake", 9);
        Product p4 = new Product("Soap", 2);

        basket.addToBasket(p1);
        basket.addToBasket(p2);
        basket.addToBasket(p3);

        System.out.println("basket total price : " + basket.getTotalPrice());

        basket.viewBasket();

        System.out.println("Basket item quantities : " + basket.totalItemCount());

        basket.removeItemFromBasket(p3);

        basket.viewBasket();

    } // end of basketOperations

} // end of Main class
