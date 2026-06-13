import java.util.*;
public class array {
    public static void print(int a[]){
        System.out.println("Array=>");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of. array = ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements in array=>");
        for(int i=0;i<a.length;i++){
            System.out.print("Enter the "+(i+1)+"th element in array = ");
            a[i]=sc.nextInt();
        }
        print(a);
    }
}
