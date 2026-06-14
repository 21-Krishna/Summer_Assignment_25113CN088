import java.util.*;
public class number_pattern {
    public static void pattern(int m){
        for(int i=1;i<=m;i++){
            for(int space=1;space<=m-i;space++){
                System.out.print("  ");
            }
            int ch=0;
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
        System.out.print("Enter the no. of rows = ");
        int n = sc.nextInt();
        pattern(n);
    }
}
