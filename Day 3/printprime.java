import java.util.*;
public class printprime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the lower limit of range x=");
        int x=sc.nextInt();
        System.out.print("Enter the upper limit of range y= ");
        int y=sc.nextInt();
        System.out.print("Prime no. between "+x+" and "+y+" =>\n");
        for(int i=x;i<=y;i++){
            boolean prime=true;
            for(int j=2;j<=(Math.sqrt(i));j++){
                if((i%j)==0){
                    prime=false;
                    break;
                }
            }
            if(prime==true){
                System.out.println(i);
            }
        }
    }
}
