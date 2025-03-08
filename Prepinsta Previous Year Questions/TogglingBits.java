/*
Problem Statement –

Joseph is learning digital logic subject which will be for his next semester. He usually tries to solve unit assignment problems before the lecture. Today he got one tricky question. The problem statement is “A positive integer has been given as an input. Convert decimal value to binary representation. Toggle all bits of it after the most significant bit including the most significant bit. Print the positive integer value after toggling all bits”.

Constrains-

1<=N<=100

Example 1:

Input :

10->Integer

Output :

5 ->result-Integer

Explanation:

Binary representation of 10 is 1010. After toggling the bits(1010), will get 0101 which represents “5”. Hence output will print “5”.
 */

import java.util.*;

public class TogglingBits {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Decimal Number : ");
        int num=scanner.nextInt();
        String binary=Integer.toBinaryString(num);
        StringBuilder sb=new StringBuilder();
        for(char bit:binary.toCharArray()){
            if(bit=='0'){
                sb.append('1');
            }else{
                sb.append('0');
            }
        }
        int result=Integer.parseInt(sb.toString(),2);
        System.out.println("After Toggling all bits the values is : "+result);
        scanner.close();
    }
}

/*
My Output :
Enter the Decimal Number : 10
After Toggling all bits the values is : 5
 */
