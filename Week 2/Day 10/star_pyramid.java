import java.util.*;
public class star_pyramid{
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int space=1;space<=n-i;space++){
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows = ");
        int n = sc.nextInt();
        pattern(n);
    }
}