import java.util.*;
public class sum {
    public static int sum_array(int a[]){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
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
        System.out.print("The sum of array elements = "+sum_array(a)+"\nAverage of array elements = "+(sum_array(a)/n));
    }
}
