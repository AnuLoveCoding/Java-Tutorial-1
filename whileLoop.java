
import java.util.Scanner;
public class whileLoop {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);


        // print 1 to N;
        // System.out.println("Enter Your Number:");
        // System.out.println("Here Your N");

        // int A = sc.nextInt();

            //   int i = 1;

            //   while(i<=A){

            //     System.out.print("i:"+i+", ");

            //     i++;
            //   }


            // int i = A;
            
            // int Product = 1;

            // while(i>0){

            //     Product*=i; {

            //     }
            //         i--;
            // }
            // System.out.println(Product);

            // Find the power 2 to the power 10;
            
            System.out.println("Enter Your A");
            int A = sc.nextInt();

            System.out.println("Enter Your B");
            int B = sc.nextInt();

            int product = 1;

            while(B>0){

                product*=A;

                B=B-1;
            }
            
            System.out.println("Enter Your Result:");
            System.out.println(product);




    }
}
