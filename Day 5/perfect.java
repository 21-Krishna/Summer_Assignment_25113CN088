import java.util.*;
public class perfect{
    public static int perfect(int n){
        int sum = 0;
        for(int i=1;i<n;i++){
            if((n%i)==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. n = ");
        int n = sc.nextInt();
        if(perfect(n)==n){
            System.out.print(n + " is a perfect no. ");
        }
        else{
            System.out.print(n + " is not a perfect no. ");
        }
    }
}