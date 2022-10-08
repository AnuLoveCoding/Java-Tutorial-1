import java.util.*;



public class electricitybill {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Your Unit:");

    
        int Unit = scn.nextInt();
        System.out.println("Your Bill:");
        // First 50 unit;
        if(Unit<=50){
            System.out.println(Unit*0.50);
            // Second next 100 Unit Rs(0.75);
        }else if( Unit<=150){
            System.out.println(50*0.50 +(Unit-50)*0.75);
            // third next 100 unit Rs(1.20);
        }else if( Unit <=250){
            System.out.println(50*0.50+100*0.75+(Unit-150)*1.20);
            // Fourth next 250 above Unit Rs(1.50);

        }else if(Unit>=250){
            System.out.println(50*0.50+100*0.75+100*1.20+(Unit-250)*1.50);
        }


    }
}
