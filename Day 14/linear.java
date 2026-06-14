import java.util.*;
public class linear{
    public static int search(int a[],int key){
        int index=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                index=i;
            }
        }
        return index;
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
        System.out.print("Enter the element to be searched = ");
        int key=sc.nextInt();
        if(search(a,key) != -1){
            System.out.print("The element exist at "+search(a,key));
        }
        else{
            System.out.print("Element does not exist");
        }
    }
}