// method 1
// import java.util.*;
// public class factorial{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the no. n=");
//         int n=sc.nextInt();
//         int fact=1;
//         for(int i=n;i>0;i--){
//             fact*=i;
//         }
//         System.out.print("Factorial of no. "+n+" = "+fact);
//     }
// }


// method 2
import java.util.*;
public class factorial{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. n=");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.print("Factorial of no. "+n+" = "+fact);
    }
}