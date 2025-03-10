/*
https://www.codechef.com/practice/course/tcs-nqt-questions/TCSNQTC/problems/TCSNQTCP05
 */

import java.util.*;

public class GoodNumber { // be a Good Human
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num=scanner.nextInt();
        System.out.println(num+" is a "+findGoodOrBad(num));
        scanner.close();
    }
    public static String findGoodOrBad(int num){
        if(num%sumOfDigits(num)==0){
            return "Good Number";
        }
        return "Bad Number";
    }
    public static int sumOfDigits(int num){
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        return sum;
    }
}

/*
My Output : 
Enter the Number : 18
18 is a Good Number

Enter the Number : 19
19 is a Bad Number

Enter the Number : 21
21 is a Good Number
 */