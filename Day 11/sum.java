import java.util.*;
public class sum {
    public static int sum_2(int n,int r){
        int s=n+r;
        return s;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. to be added =>");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.print("Sum of "+x+" and "+y+" = "+sum_2(x,y));
    }
}
