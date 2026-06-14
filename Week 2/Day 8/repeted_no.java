import java.util.*;
public class repeted_no{
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows = ");
        int n=sc.nextInt();
        pattern(n);
    }
}