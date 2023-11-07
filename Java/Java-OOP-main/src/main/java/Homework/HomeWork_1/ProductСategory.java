package Homework.HomeWork_1;

import java.util.ArrayList;

public class ProductСategory {
    private String categoryName;
    private ArrayList<Product> productArray = new ArrayList<>();;

    public ProductСategory(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public ArrayList<Product> getProductArray() {
        return productArray;
    }
    public void addProduct(Product newProduct){
        this.productArray.add(newProduct);
    }

    public void delProduct(Product findProductDel){
        this.productArray.remove(findProductDel);
    }
}
