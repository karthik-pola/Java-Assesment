package OOPS_2.Problem28;

import java.util.*;

class Product implements Comparable<Product> {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product other) {
        if (this.name.equals(other.name)) {
            return 0;
        } else if (this.name.compareTo(other.name) > 0) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "{name='" + name + "', price=" + price + "}";
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("laptop", 1200.0));
        products.add(new Product("phone", 800.0));
        products.add(new Product("tablet", 600.0));

        Collections.sort(products);
        System.out.println("Sorted objects:" + products);
    }
}
