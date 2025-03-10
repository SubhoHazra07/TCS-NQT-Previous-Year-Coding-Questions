/*
https://www.codechef.com/practice/course/tcs-nqt-questions/TCSNQTC/problems/TCSNQTCP02
 */

import java.util.*;

public class FactorialWithoutMultiplicationDivision {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num=scanner.nextInt();
        System.out.println("Factorial of "+num+" : "+factorial(num));
        scanner.close();
    }
    public static int factorial(int num){
        int fact=1;
        for(int i=2;i<=num;i++){
            fact=multiply(fact,i);
        }
        return fact;
    }
    public static int multiply(int a,int b){
        int mul=0;
        for(int i=0;i<b;i++){
            mul+=a;
        }
        return mul;
    }
}

/*
My Output :
Enter the Number : 2
Factorial of 2 : 2

Enter the Number : 5
Factorial of 5 : 120

Enter the Number : 9
Factorial of 9 : 362880
 */