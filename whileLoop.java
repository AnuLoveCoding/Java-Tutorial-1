
import java.util.Scanner;
public class whileLoop {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

    //     int n = 25364;
    //     int sum = 0;
    //     while(n > 0) {
    //         int ld = n % 10;
    //          sum += ld;
    //          System.out.print(ld + " ");
    //          n = n / 10;
    //      }
    //      System.out.print(sum);
    //  }

        // System.out.println("Enter Your Number: ");
        // int n = sc.nextInt();
        //     // if we  found n,0 the simly print 0;
        // if(n==0){

        //     System.out.println("0");

        //     // This logic reson for negative number change into positive number;

        // } else
        //  if(n<0){
        //     n = -n;  
        // }
        //     while(n>0){
        //         int rem = n%10;


        //         System.out.print(rem);


        //         n/=10;
        //     }






        // int A = 2;
        // int B = 3;
        // int product = 1;

        // while (B>0){


        //     product*=A;

        //     B-=1;
        // }
        // System.out.println(product);

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


            // print the last digt of number and sum;

            // long i= 4554655456445687787l;

            //     if(i==0){
            //         System.out.println(0);
            //     }
            //      else if(i<0){
            //         i = -i;
            //     }
            //     while(i>0){

            //         long sum = i%10;

            //         System.out.print(sum+" ");

            //         i/=10;
            //     }

        // //    find the number divisible of 35 till 1 and count it
        //         long i=454546456656556L;
        //        long count=0L;
        //         while(i>1){
        //             i/=5;
        //             count++;
        //         }

        //             System.out.println(count);

    //   find the sum of Number
        //     int A = 5;
        //     int sum = 0;
        //     int i=1;

        //     while (i<=A){
        //         sum = sum+i;
        //         i++;
        //     }
        // System.out.println(sum);

        // find the product Odd-number of Number sumof number;

        // int A = 5;
        // int i=1;
        // int multi = 1;
        // int sum =0;

        // while(i<=A){
        //     if(i%2==0){
        //         sum+=i;
                
        //     }else if(i%2!=0){
        //         multi*=i;
        //     }
        //  i++;
        // }

        // System.out.println("The sum of i is "+ sum);
        // System.out.println("The multiply is "+ multi);


            // find the divisible of Number:

            // int A = 115;
            // int  i=1;
            // int count =0;
            // int div =1;


            // while(i<=A){
            //     div/=A;
            //     count++;
            //     i++;
            // }


            // System.out.println(count);
            // System.out.println(div);

        //  find the oddsum and evensum in a number;

        // int num = 10;
        // int sumOdd= 0;
        // int sumEven= 0;
        // int i=1;

        // while(i<=num){
        //     if(i%2==0){
        //         sumOdd+=i;
        //     }else {
        //         sumEven+=i;
        //     }
        //     i++;
        // }
        // System.out.println(sumOdd);
        // System.out.println(sumEven);

        // You have a number N, you have to write a code to find odd digit sum and even digit sum from given number and print it.
        // int N = scn.nextInt();
        System.out.println("Enter your number");
            long N = scn.nextLong();

            long sumOdd = 0 ,  sumEven = 0;
            int count =0 , count1=0;
            
           
            while(N>0){
                long Digit = N%10L;
            if(Digit%2!=0){

                    sumOdd+=N%10;
                    count++;

                }else if(Digit%2==0){

                    sumEven+=N%10;
                    count1++;
                }
                   
                N/=10;
            }
        System.out.println("Sum of Odd Digit : " +sumOdd);
        System.out.println("The count of Odd-Number is "+count);
        System.out.println("Sum of Even Digit : " +sumEven);
        System.out.println("The count of Even-Number is "+count1);

    }
}
