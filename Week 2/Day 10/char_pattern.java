import java.util.*;
public class char_pattern {
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int space=1;space<=n-i;space++){
                System.out.print("  ");
            }
            char ch=64;
            for(int j=1;j<=(2*i-1);j++){
                if(i>=j){
                    ch++;
                    System.out.print(ch+" ");
                }
                else{
                    ch--;
                    System.out.print(ch+" ");
                }
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