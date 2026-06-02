import java.util.*;
public class sumofdigit{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr the no. n =");
        int n=sc.nextInt();
        int remainder,sum=0,r=n;
        while(r!=0){
            remainder=r%10;
            sum+=remainder;
            r/=10;
        }
        System.out.println("The reverse of the no. "+n+" = "+sum);
    }
}