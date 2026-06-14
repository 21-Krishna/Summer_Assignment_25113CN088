import java.util.*;
public class repeated_char {
    public static void pattern(int n){
        char ch=65;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
            ch++;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows = ");
        int n = sc.nextInt();
        pattern(n);
    }
}
