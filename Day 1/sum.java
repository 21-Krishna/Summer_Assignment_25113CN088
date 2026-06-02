import java.util.*;
public class sum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. n=");
        int n=sc.nextInt();
        int sum=0,i=1;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.print("Sum of no. upto "+n+"="+sum);
    }
}