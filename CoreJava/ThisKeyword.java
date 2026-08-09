package CoreJava;

class ProductDetails{

    String productName;
    double price;
    int quantity;

    ProductDetails(String productName,double price,int quantity){
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;

    }

    public void display(){
        System.out.println("Product Name:"+productName);
        System.out.println("Product Price:"+price);
        System.out.println("Product Quantity:"+quantity);
        System.out.println();
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        ProductDetails obj=new ProductDetails("Laptop",55000,2);
        obj.display();
    }
}
