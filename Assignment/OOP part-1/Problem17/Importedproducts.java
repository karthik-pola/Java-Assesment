public class Importedproducts {

    private int price;
    private String name;
    private double base_price;
    private int import_duty;

    public Importedproducts(int price, String name, double base_price, int import_duty) {
        this.price = price;
        this.name = name;
        this.base_price = base_price;
        this.import_duty = import_duty;
    }

    public Importedproducts(int price, String name, double base_price) {
        this.price = price;
        this.name = name;
        this.base_price = base_price;
    }

    public Importedproducts(int price, String name) {
        this.price = price;
        this.name = name;
    }   

    public Importedproducts(String name) {  
        this.name = name;
    }

    public double getNetPrice(){
        return price+import_duty;
    }

    public double getPrice(){
        return price;
    }   

    public double setImport_duty(int import_duty){
        return this.import_duty = import_duty;
    }

    public void print(){
        System.out.println("Product Name: "+name + " " + "Base Price: "+base_price + " " +"Import Duty: "+ import_duty);
    }
    
}
