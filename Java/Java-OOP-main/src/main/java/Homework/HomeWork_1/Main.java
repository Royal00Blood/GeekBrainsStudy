package Homework.HomeWork_1;

public class Main {
    public static void main(String[] args) {
        Product burger = new Product("Burger", 14.5, 5.1);
        Product kitchen = new Product("Kitchen", 5.4, 5.1);
        Product salt = new Product("Salt", 3.5, 2.1);
        Product carrot = new Product("Carrot", 2, 1.1);
        Product apple = new Product("Apple", 20, 3.1);

        ProductСategory vegetables = new ProductСategory("vegetables");
        vegetables.addProduct(carrot);
        ProductСategory fruits = new ProductСategory("fruits");
        fruits.addProduct(apple);
        ProductСategory fastFood = new ProductСategory("fastFood");
        fastFood.addProduct(salt);
        fastFood.addProduct(burger);
        fastFood.addProduct(kitchen);
        User Ivan = new User("Bob", "123");
        User Nikola = new User("Gob", "1142");
        User Smirnov = new User("Job", "133");
        printCategory(vegetables);
        printCategory(fruits);
        printCategory(fastFood);
        productPath(Ivan,vegetables,carrot);
        productPath(Ivan,fastFood,salt);
        productPath(Nikola,fruits,apple);
        userBuyProd(Ivan);
        userBuyProd(Nikola);
        userBuyProd(Smirnov);
    }

    private static void printCategory(ProductСategory category){
        System.out.print("category: ");
        System.out.println(category.getCategoryName());
        for (Product product: category.getProductArray()) {
            System.out.printf("Название %s цена %f рейтинг %f", product.getName(), product.getPrice(), product.getRating() );
            System.out.println();
        }
        System.out.println("''''''''''''''''''''''''''''/////''.......''''''''''''''''''''''''''''''''");
    }

    private static void productPath(User user, ProductСategory category, Product product){
        user.addProduct(product);
        category.delProduct(product);
    }

    private static void userBuyProd(User user){
        System.out.print("User: ");
        System.out.println(user.getLogin());
        System.out.printf("%s buy: ",user.getLogin());
        System.out.println();
        for (Product product: user.getBasket().getProductArray()) {
            System.out.printf("Название %s цена %f рейтинг %f", product.getName(), product.getPrice(), product.getRating() );
            System.out.println();
        }
        System.out.println("''''''''''''''''''''''''''''/////''.......''''''''''''''''''''''''''''''''");
    }


}
