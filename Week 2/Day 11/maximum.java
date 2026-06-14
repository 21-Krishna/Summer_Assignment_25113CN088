import java.util.*;
public class maximum{
    public static int max(int a[]){
        int max=Integer.MIN_VALUE,secmax=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<a.length;i++){
            System.out.print("Enter the "+i+"th element of array = ");
            a[i]=sc.nextInt();
        }
        System.out.print("The maximum of all no. of a array = "+max(a));
    }
}
