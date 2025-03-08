/*
Output : 
A supermarket maintains a pricing format for all its products. A value N is printed on each product. When the scanner reads the value N on the item, the product of all the digits in the value N is the price of the item. The task here is to design the software such that given the code of any item N the product (multiplication) of all the digits of value should be computed(price).

Example 1:

Input :

5244 -> Value of N

Output :
160 -> Price 

Explanation:

From the input above 

Product of the digits 5,2,4,4

5*2*4*4= 160

Hence, output is 160.
 */

import java.util.*;

public class PricingFormat {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the price of the Item : ");
        int price=scanner.nextInt();
        int result=computedPrice(price);
        System.out.println("Computed Price is : "+result);
        scanner.close();
    }
    public static int computedPrice(int price){
        int mul=1;
        while(price>0){
            mul=mul*(price%10);
            price/=10;
        }
        return mul;
    }
}

/*
Output :
Enter the price of the Item : 5244
Computed Price is : 160

They didn't tell about what if the price is 
Enter the price of the Item : 50026
Computed Price is : 0
 */