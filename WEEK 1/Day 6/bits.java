import java.util.*;
public class bits {
    public static int binary(int n){
        int remainder=0,b=0,pow=0;
        while(n!=0){
            remainder=n%2;
            b=b+(remainder*((int)Math.pow(10,pow)));
            pow++;
            n/=2;
        }
        return b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. n = ");
        int n=sc.nextInt();
        int x=binary(n);
        int count=0;
        while(x!=0){
            count+=1;
            x/=10;
        }
        System.out.print("Bits in a no = "+count);
    }
}
