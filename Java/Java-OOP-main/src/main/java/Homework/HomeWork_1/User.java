package Homework.HomeWork_1;

public class User{
    private String login;
    private String password;
    private Basket basket = new Basket();

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Basket getBasket() {
        return basket;
    }
    public void delProduct(Product findProductDel){
        basket.delProduct(findProductDel);
    }
    public void addProduct(Product addProduct) {
        basket.addProduct(addProduct);
    }
}
