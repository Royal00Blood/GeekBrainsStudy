package Homework.HomeWork_1;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> productArray = new ArrayList<>();
    public void addProduct(Product newProduct){
        this.productArray.add(newProduct);
    }
    public void delProduct(Product findProductDel){
        this.productArray.remove(findProductDel);
    }
    public ArrayList<Product> getProductArray() {
        return productArray;
    }
}
