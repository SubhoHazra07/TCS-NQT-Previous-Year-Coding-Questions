/*
https://www.codechef.com/practice/course/tcs-nqt-questions/TCSNQTC/problems/TCSNQTCP06
 */

import java.util.*;

public class VehicleManufacturing {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Total Number of Vehicles : ");
        int vehicle=scanner.nextInt();
        System.out.print("Enter Total Number of Wheels : ");
        int wheel=scanner.nextInt();
        wheelsCalculation(vehicle,wheel);
        scanner.close();
    }
    public static void wheelsCalculation(int v,int w){
        if(w%2!=0||w<2*v||w>4*v||w<2){
            System.out.println("It's not possible to manufacture !!! means -1");
            return;
        }
        int twoWheelers=(4*v-w)/2;
        int fourWheelers=(w-2*v)/2;
        System.out.println("Number of Two Wheelers : "+twoWheelers);
        System.out.println("Number of Four Wheelers : "+fourWheelers);
    }
}

/*
My Output : 
Enter Total Number of Vehicles : 12
Enter Total Number of Wheels : 34
Number of Two Wheelers : 7
Number of Four Wheelers : 5

Enter Total Number of Vehicles : 10
Enter Total Number of Wheels : 25
It's not possible to manufacture !!! means -1
 */