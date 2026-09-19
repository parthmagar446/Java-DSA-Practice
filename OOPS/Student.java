package OOPS;
import java.util.Scanner;
//19)	Develop a Java program using a class named Student to store and display student details. 
//The class should contain data members for the student name, roll number, and marks.
//Accept the required details from the user and display them using suitable methods
public class Student {
    String name;
    int rollno;
    float marks;

    public void setinfo(String name, int rollno,float marks){
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }

    void display(){
        System.out.println("Student information");
        System.out.println("name=" + name);
        System.out.println("Roll no=" + rollno);
        System.out.println("marks=" + marks);
        
    }
    public static void main (String args[]){
        Scanner in=new Scanner(System.in);
        Student s1=new Student();
        System.out.println("Enter name:");
        String name=in.nextLine();
        System.out.println("Roll no:" );
        int rollno=in.nextInt();
        System.out.println("marks:");
        float marks=in.nextFloat();
        
        s1.setinfo(name, rollno,marks);
        s1.display();
    }

}
