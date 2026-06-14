import java.util.*;
public class frequency {
    public static void count(int a[]){
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            int count=1;
            while((i<a.length-1)&&(a[i]==a[i+1])){
                count++;
                i++;
            }
            System.out.println("Frequency of "+a[i]+" = "+count);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the aray element =>");
        for(int i=0;i<a.length;i++){
            System.out.print("Enter the "+(i+1)+"th element of array = ");
            a[i]=sc.nextInt();
        }
        count(a);
    }
}
