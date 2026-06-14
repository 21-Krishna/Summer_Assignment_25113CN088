import java.util.*;
public class second{
    public static int second_max(int a[]){
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(max<a[i]){//if secmax lies before max
                secmax=max;//then the previous value of max is new secmax
                max=a[i];
            }
            else if((secmax<a[i])&&(a[i]!=max)){//if secmax lies after max
                secmax=a[i];
            }
        }
        return secmax;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array element =>");
        for(int i=0;i<a.length;i++){
            System.out.print("Enter the "+(i+1)+"th element of array = ");
            a[i]=sc.nextInt();
        }
        if(second_max(a)==Integer.MIN_VALUE){
            System.out.print("Second maximum element does not exist");
        }
        else{
            System.out.print("Second maximum element = "+second_max(a));
        }
    }
}
