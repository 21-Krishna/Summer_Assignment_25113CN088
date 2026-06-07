import java.util.*;
public class dtob{
    public static int binary(int n){
        int remainder=0,d=0,pow=0;
        while(n!=0){
            remainder=n%2;
            d=d+(remainder*((int)Math.pow(10,pow)));
            pow++;
            n/=2;
        }
        return d;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal no. n = ");
        int n = sc.nextInt();
        System.out.print("Binary no. of "+n+" = "+binary(n));
    }
}