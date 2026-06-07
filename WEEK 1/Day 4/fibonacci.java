import java.util.*;
public class fibonacci{
    public static void fibocheck(int n){
        int a=0,b=1,c=0;
        if(n<=0){
            System.out.print("Fibonacci not possible for negative no.");
        }
        else if(n==1){
            System.out.print(n+"th term of fibonacci series = "+a);
        }
        else if(n==2){
            System.out.print(n+"th term of fibonacci series = "+b);
        }
        else{
            for(int i=2;i<n;i++){
                c=a+b;
                a=b;
                b=c;
            }
            System.out.print(n+"th term of fibonacci series = "+c);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the nth no. n = ");
        int n=sc.nextInt();
        fibocheck(n);
    }
}