
import java.util.Scanner;
public class whileLoop {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);


        // print 1 to N;
        System.out.println("Enter Your Number:");
        // System.out.println("Here Your N");

        int A = sc.nextInt();

            //   int i = 1;

            //   while(i<=A){

            //     System.out.print("i:"+i+", ");

            //     i++;
            //   }


            int i = A;
            
            int Product = 1;

            while(i>0){

                Product*=i; {

                }
                    i--;
            }
            System.out.println(Product);








    }
}
