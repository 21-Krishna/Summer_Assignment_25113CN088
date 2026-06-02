import java.util.*;
public class count{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no. n=");
        int n=sc.nextInt();
        int count=0;
        while(n!=0){
            if((n%10)!=0){
                count++;
            }
            n/=10;
        }
        System.out.print("The no. of digits in no. = "+count);
    }
}