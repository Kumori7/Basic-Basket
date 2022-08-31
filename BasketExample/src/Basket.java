public interface Basket {

    public void addToBasket(Product product);

    public void viewBasket();

    public void removeItemFromBasket(Product product);

    public int getTotalPrice();

    public int totalItemCount();


}
