import java.util.*;
public class table{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. for table=");
        int n=sc.nextInt();
        System.out.print("Enter the no. x for upto table required=");
        int x=sc.nextInt();
        System.out.println("The table of "+n+" is=>");
        for(int i=1;i<=x;i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }
}