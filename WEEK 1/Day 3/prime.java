// import java.util.*;
// public class prime{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the no. n=");
//         int n=sc.nextInt();
//         int i;
//         for(i=2;i<=(Math.sqrt(n));i++){
//             if((n%i)==0){
//                 System.out.print(n+" is not prime");
//                 break;
//             }
//         }
//         if(i>(Math.sqrt(n))){
//             System.out.print(n+" is prime no.");
//         }
//     }
// }


// import java.util.*;
// public class prime{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the no. n=");
//         int n=sc.nextInt();
//         boolean prime=true;
//         for(int i=2;i<=(Math.sqrt(n));i++){
//             if((n%i)==0){
//                 prime=false;
//                 break;
//             }
//         }
//         if(prime==true){
//             System.out.print(n+" is prime no.");
//         }
//         else{
//             System.out.print(n+" is not a prime no.");
//         }
//     }
// }