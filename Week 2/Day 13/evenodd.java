import java.util.*;
public class evenodd {
    public static int count_even(int a[]){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2 == 0){
                count++;
            }
        }
        return count;
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
        System.out.print("The no. of even elements = "+count_even(a)+"\nThe no. of odd element = "+(a.length - count_even(a)));
    }
}
