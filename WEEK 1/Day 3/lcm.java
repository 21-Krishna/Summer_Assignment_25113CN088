import java.util.*;
public class lcm{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st no.=");
        int n=sc.nextInt();
        System.out.print("Enter the 2nd no.=");
        int r=sc.nextInt();
        int x,gcd=1,lcm;
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
        lcm=((n*r)/gcd);
        System.out.print("Greatest common divisor of no. "+n+" and "+r+" = "+lcm);
    }
}
