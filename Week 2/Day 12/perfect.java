import java.util.*;
public class perfect {
    public static void perfect_no(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if((n%i)==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.print("The number "+n+" is a perfect no.");
        }
        else{
            System.out.print("The number "+n+" is not a perfect no.");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. n = ");
        int n=sc.nextInt();
        perfect_no(n);
    }
}
