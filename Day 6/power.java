import java.util.*;
public class power {
    public static int exponent(int a , int b){
        int p=1;
        for(int i=1;i<=b;i++){
            p*=a;
        }
        return p;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. n = ");
        int n=sc.nextInt();
        System.out.print("Enter the power to raise = ");
        int r=sc.nextInt();
        System.out.print(n+" raise to power "+r+" = "+exponent(n, r));
    }
}
