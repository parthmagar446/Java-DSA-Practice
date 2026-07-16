package Assignment4;

public class Q12 {
    public static void main(String[] args){
            if(pythagorastriplet(3,4,5)){
                System.out.println("It is a pythagoras triplet");
            }else{
                System.out.println("It is not a pythagoras triplet");
            }

            if(pythagorastriplet(6,4,5)){
                System.out.println("It is a pythagoras triplet");
            }else{
                System.out.println("It is not a pythagoras triplet");
            }
    }
        static boolean pythagorastriplet(int a,int b,int c){
            if(a*a==(b*b)+(c*c)){
                return true;
            }else if(b*b==(a*a)+(c*c)){
                return true;
            }else if(c*c==(a*a)+(b*b)){
                return true;
            }else{
                return false;
            }
        }
}

