import java.util.*;
public class gcd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st no.=");
        int n=sc.nextInt();
        System.out.print("Enter the 2nd no.=");
        int r=sc.nextInt();
        int x,gcd=1;
        if(n>r){
            x=n;
        }
        else{
            x=r;
        }
        for(int i=1;i<x;i++){
            if(((n%i)==0)&&((r%i)==0)){
                gcd=i;
            }
        }
        System.out.print("Greatest common divisor of no. "+n+" and "+r+" = "+gcd);
    }
}