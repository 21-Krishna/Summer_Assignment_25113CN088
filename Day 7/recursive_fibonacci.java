import java.util.*;
public class recursive_fibonacci{
    public static int fibonacci(int n){
        if(n==1 || n==2){
            return (n-1);
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. n = ");
        int n = sc.nextInt();
        System.out.println("fibonacci series of "+n+" terms =>");
        for(int i=1;i<=n;i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
}