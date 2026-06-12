import java.util.*;
public class palindrome{
    public static boolean ispalindrome(int n){
        int remainder=0,reverse=0,pow=0,n1=n;
        while(n!=0){
            remainder=n%10;
            reverse=remainder+(reverse*10);
            pow++;
            n/=10;
        }
        if(n1==reverse){
            return true;//if palindrome then function ends here
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. n = ");
        int n=sc.nextInt();
        if(ispalindrome(n)==true){
            System.out.print(n+" is palindrome number");
        }
        else{
            System.out.print(n+" is not a palindrome");
        }
    }
}