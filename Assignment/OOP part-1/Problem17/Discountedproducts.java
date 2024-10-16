public class Discountedproducts {
    
    int discount_rate;
    String name;
    double base_price;
    double price;
    
    public Discountedproducts(int discount_rate, String name, double base_price) {
        this.discount_rate = discount_rate;
        this.name = name;
        this.base_price = base_price;
    }
    public Discountedproducts(int discount_rate, String name) {
        this.discount_rate = discount_rate;
        this.name = name;
    }
    public Discountedproducts(String name) {
        this.name = name;
    }
    
    public double getNetPrice(){
        return price*discount_rate/100;
    }

    public double getPrice(){
        return base_price;
    }
    public void setDiscount_rate(int discount_rate) {
        this.discount_rate = discount_rate;
    }


    public void print(){
        System.out.println("Product Name: "+name + " " + "Base Price: "+base_price + " " +"Discount Rate:"+ discount_rate);
    }
}
