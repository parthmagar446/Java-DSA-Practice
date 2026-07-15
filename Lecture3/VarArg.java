package Lecture3;
import java.util.Arrays;
//varArg = Variable Length Argument
import java.util.Scanner;
public class VarArg {
    public static void main(String[] args)
    {
        vararg(1,5,84,694,45,34,25);
        vararg("parth","anand","magar");
        vararg(1,2,"magar","parth","anand");
    } 
    //it is used when the number of argument is not fixed
    static void vararg(int ... a)
    {
        System.out.println(Arrays.toString(a));
    }
    //function can be of same name but datatype (argument) should be different
    //or number of argument should be different
    static void vararg(String ... s)
    {
        System.out.println(Arrays.toString(s));
    }

    static void vararg(int a , int b, String...s)
    {
        System.out.println(a+" "+ b+" "+ Arrays.toString(s));
    }
}
