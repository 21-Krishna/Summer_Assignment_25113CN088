import java.util.*;
public class strong{
    public static int factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void strong(int n){
        int n1=n,remainder,sum=0;
        while(n1!=0){
            remainder = n1 % 10;
            sum += factorial(remainder);
            n1/=10;
        }
        if(sum == n){
            System.out.print(n + " is a perfect no.");
        }
        else{
            System.out.print(n + " is not a perfect no.");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. n = ");
        int n = sc.nextInt();
        strong(n);
    }
}

