import java.util.*;
public class palindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr the no. n =");
        int n=sc.nextInt();
        int remainder,reverse=0,r=n;
        while(r!=0){
            remainder=r%10;
            reverse=(reverse*10)+remainder;
            r/=10;
        }
        if(n==reverse){
            System.out.println("The no. "+n+" is a palindrome");
        }
        else{
            System.out.println("The no. "+n+" is not a palindrome");
        }
    }
}
