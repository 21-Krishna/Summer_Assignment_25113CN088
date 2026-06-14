import java.util.*;
public class reverse_pyramid {
    public static void pattern(int n){
        for(int i=n;i>=1;i--){
            for(int space=1;space<=n-i;space++){
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows n = ");
        int n = sc.nextInt();
        pattern(n);
    }   
}