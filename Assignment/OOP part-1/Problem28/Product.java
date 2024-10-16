import java.util.*;
public class Product implements Comparable<Product>{


    public int compareTo(Product that){


        if(this.price > that.price){
            return -1;
        }
        else if(this.price > that.price){
            return 1;
        }

        return 0;
    }
    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }
    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getProd_id() {
        return prod_id;
    }

    public String getProd_name() {
        return prod_name;
    }

    public double getPrice() {
        return price;
    }
    private int prod_id;
    private String prod_name;
    private double price;

    public Product(int prod_id, String prod_name, double price){
        this.prod_id = prod_id;
        this.prod_name = prod_name;
        this.price = price;
    }


    
}
