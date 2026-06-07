import java.util.*;
public class reverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr the no. n to be reversed=");
        int n=sc.nextInt();
        int remainder,reverse=0,r=n;
        while(r!=0){
            remainder=r%10;
            reverse=(reverse*10)+remainder;
            r/=10;
        }
        System.out.println("The reverse of the no. "+n+" = "+reverse);
    }
}