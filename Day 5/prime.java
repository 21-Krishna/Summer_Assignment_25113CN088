import java.util.*;
public class prime {
    public static int prime_no(int m){
        boolean isprime=true;
        for(int i=2;i<=((int)Math.sqrt(m));i++){
            if((m%i)==0){
                isprime = false;
                break;
            }
        }
        if(isprime == true){
            return m;
        }
        else{
            return 0;
        }
    }
    public static int largest_prime(int n){
        int p=0;
        for(int i=1;i<=n;i++){
            if((n%i)==0){
                if(prime_no(i)==i){
                    p=i;
                }
            }
        }
        return p;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. n = ");
        int n = sc.nextInt();
        System.out.print("Largest prime factor of " + n + " = " +largest_prime(n));
    }
}

