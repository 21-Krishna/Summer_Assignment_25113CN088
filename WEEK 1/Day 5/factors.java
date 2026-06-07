import java.util.*;
public class factors {
    public static void factors(int n){
        System.out.print("Factors of "+ n + " =>\n");
        for(int i=1;i<=n;i++){
            if((n%i)==0){
                System.out.print(i + " ");
            }
        }
    }
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. n = ");
        int n = sc.nextInt();
        factors(n);
    }
}

