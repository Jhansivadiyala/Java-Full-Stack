import java.util.*;
public class Boxing {
    public static void main(String args[]){
        int a = 10;
        //Integer aa = new Integer(a)
        Integer aa = Integer.valueOf(a);//boxing
        System.out.println(aa);
        Integer abj = a;//Auto boxing
        System.out.println(abj);
        int b = abj.intValue();//unboxing
        System.out.println(b);
        int c=abj; //Auto unboxing
        System.out.println(c);
    }
    
}
