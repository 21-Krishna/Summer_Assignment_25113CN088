import java.util.*;
public class largest {
    public static int smallest(int a[]){
        int min=a[0];
        for(int i=1;i<a.length;i++){
            min=Math.min(a[i],min);
        }
        return min;
    }
    public static int largest(int a[]){
        int max=a[0];
        for(int i=1;i<a.length;i++){
            max=Math.max(max,a[i]);
        }
        return max;
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
        System.out.print("The largest element = "+largest(a)+"\nThe smallest element = "+smallest(a));
    }
}
