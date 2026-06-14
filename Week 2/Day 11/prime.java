import java.util.*;
public class prime {
    public static boolean prime(int n){
        for(int i=2;i<Math.sqrt(n);i++){//checking from 2 to root(n)
            
            if((n%i)==0){//as if other than no. and 1 if any no divides n means it is not a prime
                return false;// if not prime runs till here
            }
        }
        return true;//if prime than function run till here
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. to be checked = ");
        int n = sc.nextInt();
        if(n==1){
            System.out.print("Unique no.");
        }
        else{
            if(prime(n)==true){
                System.out.print("The no. "+n+" is a prime no.");
            }
            else{
                System.out.print("The no. "+n+" is not a prime no.");
            }            
        }
    }
}
