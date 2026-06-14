import java.util.*;
public class Amstrong{
    public static boolean amstrong(int n){
        int n1=n,n2=n,count=0,remainder=0,sum=0;
        while(n1!=0){//count no. of digits
            count++;
            n1/=10;
        }
        while(n2!=0){//add each digit raised to power of total no. of digits
            remainder=n%10;
            sum=sum+((int)Math.pow(remainder,count));
            n2/=10;
        }
        if(sum==n){
            return true;//if no. is amstrong then function stops here
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. n = ");
        int n=sc.nextInt();
        if(amstrong(n)==true){
            System.out.print(n+" is a amstrong number");
        }
        else{
            System.out.print(n+" is not a amstrong number");
        }
    }
}