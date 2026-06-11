import java.util.*;
public class factorial {
    public static int fact_no(int n){
        int fact=1;
        if(n==0){
            return 1;//if true stop here the function
        }
        else if(n<=0){
            return -1;//if true function stops here
        }
        else{
            for(int i=1;i<=n;i++){
                fact*=i;
            }
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. n = ");
        int n = sc.nextInt();
        if(fact_no(n)==-1){
            System.out.print("Negative no.'s factorial doesn't exist");
        }
        else{
            System.out.print("The factorial of no. "+n+" = "+fact_no(n));
        }
    }
}
