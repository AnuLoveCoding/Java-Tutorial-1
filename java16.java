/**
 * java16
 */
import java.util.*;
public class java16 {

    public static void main(String[] args) {
        int age = 25; //int age assign value(=) 25; not equal to 25;
        // (1st Method)
        if(age>18){
            System.out.println("you can drive boy!");
        }else{
            System.out.println("you can't drive boy..)");
        }

            //(2nd) Method;
        boolean cond = (age==18);

        if(cond){
            System.out.println("You can de=rive boy @");
        }else{
            System.out.println("You can't drive boy %");
        }

    }
}