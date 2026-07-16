package Assignment4;
public class Q13 {
    public static void main(String[] args){
        int a=2;
        int b=20;
        allprime(a,b);
    }
    static void allprime(int a,int b){
        for(int i=a;i<=b;i++){
            int count=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
                if(count==0){
                    System.out.print(i+ " ");
                }   
            }
        }
    }

