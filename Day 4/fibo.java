import java.util.*;
public class fibo{
    public static void fibono(int n){
        int a=0,b=1,c;
        if(n<=0){
            System.out.print("Fibonacci series not possible for negative no.");
        }
        else if(n==1){
            System.out.print(a+" ");
        }
        else if(n==2){
            System.out.print(a+" "+b+" ");
        }
        else{
            System.out.print(a+" "+b+" ");
            for(int i=2;i<n;i++){
                c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. n = ");
        int n=sc.nextInt();
        fibono(n);
    }
}