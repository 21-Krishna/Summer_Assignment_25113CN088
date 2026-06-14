import java.util.*;
public class character_triangle{
    public static void pattern(int n){
        for(int i=0;i<n;i++){
            char ch=65;
            for(int j=0;j<=i;j++){
                System.out.print(ch);
                ch++;
            }System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows = ");
        int n=sc.nextInt();
        pattern(n);
    }
}