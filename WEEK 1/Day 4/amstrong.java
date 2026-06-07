import java.util.*;
public class amstrong{
    public static int am(int n){
        int n1=n,n2=n,count=0,remainder,amst=0;
        while(n1!=0){
            count++;
            n1/=10;
        }
        while(n2!=0){
            remainder=n2%10;
            int p=1;
            for(int i=0;i<count;i++){
                p*=remainder;
            }
            amst+=p;
            n2/=10;
        }
        return amst;
    }
    public static void main(String args[]){
        System.out.print("Enter the no. n =");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==am(n)){
            System.out.print(n+" is a Amstrong no.");
        }
        else{
            System.out.print(n+" is not a Amstrong no.");
        }
    }
}