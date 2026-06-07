import java.util.*;
public class productofdigit{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr the no. n =");
        int n=sc.nextInt();
        int remainder,product=1,r=n;
        while(r!=0){
            remainder=r%10;
            product*=remainder;
            r/=10;
        }
        System.out.println("The product of digits of the no. "+n+" = "+product);
    }
}