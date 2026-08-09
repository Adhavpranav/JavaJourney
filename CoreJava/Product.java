package CoreJava;

public class Product {

    private String productName;
    private double price;
    private int quantity;

    public void setValues(String productName,double price,int quantity){
        if(price<0 || quantity<0){
            System.out.println("Product price or quantity cannot be less than zero");
            return;
        }
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;
    }

    public String getProductName(){
        return  this.productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public static void main(String[] args) {
        Product product=new Product();
        product.setValues("macbook",50000,10);
        System.out.println("Product details:");

        System.out.println(product.getProductName());
        System.out.println(product.getPrice());
        System.out.println(product.getQuantity());
    }
}
