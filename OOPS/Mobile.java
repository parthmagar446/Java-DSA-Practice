package OOPS;
//15)	Make use of classes and objects to develop a simple Java program for a Mobile Phone Management System.
 //The program should store and display the brand, model, price, and storage capacity of a mobile phone 
 //using suitable data members and methods.
public class Mobile {
    String brand;
    String model;
    double price;
    int storage;
 
     void setdetails(String brand,String model,double price,int storage){
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.storage=storage;
    }

    void display(){
         System.out.println("brand="+ brand);
        System.out.println("model="+ model);
        System.out.println("price="+ price);
        System.out.println("storage="+storage);
    }
    public static void main(String args[]){
        Mobile m1=new Mobile();
        m1.setdetails("samsung", "S24", 131318, 256);
        m1.display();
    }
}
