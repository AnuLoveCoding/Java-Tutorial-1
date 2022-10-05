import java.util.Scanner;
public class java18 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);



            System.out.println("Enter Your age : ");
        int age = scn.nextInt();

        if(age>= 20){
            System.out.println("You are experienced");
        }else if(age>=18){
            System.out.println("Your are semi experienced");
        }else if(age>=10){
            System.out.println("your are semi-semi experienced");
        }else{
            System.out.println("Your are not eligible");
        }


    }
}
