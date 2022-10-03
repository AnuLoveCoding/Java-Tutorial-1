/**
 * java10
 */
import java.util.*;
public class java10 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       
       
        //  byte x = 5;
        //  int y = 6;
        //  short z =8;
        //  int a = 164 + 4;
        //  float b = (float)6.52 + x ;

        //  System.out.println(b);

        //  Increment and Decremeny;

        int i = 7;
        // 
        System.out.println(++i);
        System.out.println(i);
        System.out.println(i++);
        // System.out.println(i++);
        System.out.println(i);

        int j = 67;
        int c = ++j;
        System.out.println(c);

        int b = 80;
        System.out.println(b--);
        System.out.println(b);
        System.out.println(--b);
        System.out.println(b);
        System.out.println(b+2);


            // quickk quiz: what will be the vallue of the following expression(x);
                int y = 7;
                int x = ++y*8;
                System.out.println(x);

            //  quick quiz: what will be the value of the following expression(a);

            char ch = 'A';  // in char always use to increment always use single quotes('');
            System.out.println(++ch);
            System.out.println(++ch);



    }
}