package CoreJava;

class Book{
    String title;
    String auther;
    double price;

    Book(){
        title="Unknown";
        auther="Unknown";
        price=0;
    }

    Book(String title,String auther){
        this.title=title;
        this.auther=auther;
    }

    Book(String title,String auther,double price){
        this.title=title;
        this.auther=auther;
        this.price=price;
    }

     void display(){
         System.out.println("Book title:"+title);
         System.out.println("Book auther:"+auther);
         System.out.println("Book price:"+price);
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Book obj1=new Book();
        Book obj2=new Book("Bmw Dream","Pranav");
        Book obj3=new Book("For Bmw","Child",134);

        obj1.display();
        obj2.display();
        obj3.display();
    }
}
