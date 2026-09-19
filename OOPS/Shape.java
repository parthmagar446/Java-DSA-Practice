package OOPS;
import java.util.Scanner;
//14)	Construct a Java program using a class named Shape by choosing suitable data members and
//  methods to calculate the area and perimeter of  rectangle,circle create separate two object.
//  The program should accept input and display the calculated area and perimeter for both objects.
public class Shape {
   float length;
   float width;
   float radius;
    
   public void RectanglePerimeter(){
        float perimeter= 2*( length +width);
        System.out.println("Rectangle perimeter="+perimeter);
   }

   public void RectangleArea(){
        float Area= length*width;
        System.out.println("Rectangle area="+Area);
   }
   
   public void Circleperimeter(){
        float circumference= 2*3.14f*radius;
        System.out.println("Circle perimeter="+circumference);
   }

   public void CircleArea(){
        float Area= 3.14f*radius*radius;
        System.out.println("Circle Area="+Area);
   }
   

   public static void main(String args[]){
    Scanner in= new Scanner(System.in);
    Shape rectangle=new Shape();
    System.out.println("enter the length:");
    rectangle.length=in.nextFloat();
    System.out.println("enter the width :");
    rectangle.width=in.nextFloat();

    Shape circle=new Shape();
    System.out.println("enter the radius:");
    circle.radius=in.nextFloat();

     rectangle.RectanglePerimeter();
     rectangle.RectangleArea();
     circle.CircleArea();
     circle.Circleperimeter();
}
}
