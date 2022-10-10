
import java.util.Scanner;
public class whileLoop {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Number: ");
        int n = sc.nextInt();
            // if we  found n,0 the simly print 0;
        if(n==0){

            System.out.println("0");


        }
        // This logic reson for negative number change into positive number;
        else
         if(n<0){
            n = -n;  
        }
            while(n>0){
                int rem = n%10;


                System.out.print(rem);


                n/=10;
            }












































































































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
            
            // System.out.println("Enter Your A");
            // int A = sc.nextInt();

            // System.out.println("Enter Your B");
            // int B = sc.nextInt();

            // int product = 1;

            // while(B>0){

            //     product*=A;

            //     B=B-1;
            // }
            
            // System.out.println("Enter Your Result:");
            // System.out.println(product);





    }
}
