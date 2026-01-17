package bai4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;


public class ProductManager {
//    private ArrayList<Product> products = new ArrayList<>();
    private LinkedList<Product> products = new LinkedList<>();

    public void addProduct(Product product) {
        for (Product p : products) {
            if (p.getId() == product.getId()) {
                System.out.println("Product already exists");
                return;
            }
        }
        products.add(product);
        System.out.println("Product added successfully");
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void removeProduct(int id) {
        if (products.removeIf(product -> product.getId() == id)) {
            System.out.println("Removed product with id: " + id);
        } else {
            System.out.println("Product not found");
        }
    }

    public void updateProduct(int id, String newName) {
        products.forEach(product -> {
            if (product.getId() == id) {
                product.setName(newName);
                System.out.println("Updated product: " + product);
            } else {
                System.out.println("Product not found");
            }
        });
    }

    public void searchProduct(String name) {
        products.forEach(product -> {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(product);
            } else {
                System.out.println("Product not found");
            }
        });
    }

    public void sortByPriceDesc() {
        products.sort(Comparator.comparing(Product::getPrice).reversed());
        displayProducts();
    }

    public void sortByPriceAsc() {
        products.sort(Comparator.comparingDouble(Product::getPrice));
        displayProducts();
    }


}
