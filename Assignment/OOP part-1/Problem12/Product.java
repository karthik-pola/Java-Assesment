public class Product{
    private int prod_id;
    private String prod_name;
    private double price;
    private int quantity_on_hand;
    
    public Product(int prod_id, String prod_name, double price){
        this.prod_id = prod_id;
        this.prod_name = prod_name;
        this.price = price;
    }

    public Product(int prod_id, String prod_name){
        this.prod_id = prod_id;
        this.prod_name = prod_name;
    }

    double getNetprice(){
        return price*1.12;
    }

}