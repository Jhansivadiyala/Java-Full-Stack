import java.util.*;
public class p4 {
    public static void main(String[] args) {
        int a,sum=0,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        a = sc.nextInt();
        while(a!=0){
            r=a%10;
            sum=sum+r;
            a=a/10;

        }
        System.out.println(sum);
    }
    
}
