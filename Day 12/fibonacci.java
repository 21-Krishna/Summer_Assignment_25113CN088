import java.util.*;
public class fibonacci {
    public static void fibo(int n){
        int a=0,b=1,c;
        if(n<=0){
            System.out.print("fibonacci series not possible");
        }
        else if(n==1){
            System.out.print(a);
        }
        else if(n==2){
            System.out.print(a+" "+b);
        }
        else{
            System.out.print(a+" "+b+" ");
            for(int i=1;i<=n-2;i++){
                c=(a+b);
                System.out.print(c+" ");
                a=b;
                b=c;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements of n = ");
        int n=sc.nextInt();
        fibo(n);
    }
}
