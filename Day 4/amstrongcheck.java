import java.util.*;
public class amstrongcheck {
    public static void amstrongno(int a , int b){
        System.out.print("The Amstrong no. between "+a+" and "+b+" =>\n");
        for(int i=a;i<=b;i++){
            int n1=i,n2=n1,count=0,remainder=0,sum=0;
            while(n1!=0){
                count++;
                n1/=10;
            }
            while(n2!=0){
                remainder=n2%10;
                int prod=1;
                for(int j=0;j<count;j++){
                    prod*=remainder;
                }
                sum+=prod;
                n2/=10;
            }
            if(sum==i){
                System.out.println(i+" is a Amstrong no.");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the lower limit of range = ");
        int x = sc.nextInt();
        System.out.print("Enter the upper limit of range = ");
        int y = sc.nextInt();
        amstrongno(x, y);
    }
}