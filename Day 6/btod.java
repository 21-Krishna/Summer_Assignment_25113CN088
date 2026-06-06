import java.util.*;
public class btod {
    public static int decimal(int n){
        int remainder=0,b=0,pow=0;
        while(n!=0){
            remainder=n%10;
            b=b+(remainder*((int)Math.pow(2,pow)));
            pow++;
            n/=10;
        }
        return b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binar no. n = ");
        int n=sc.nextInt();
        System.out.print("Decimal no. of "+n+" = "+decimal(n));
    }
}
