/*
https://www.codechef.com/practice/course/tcs-nqt-questions/TCSNQTC/problems/TCSNQTCP10
 */

import java.util.*;

public class ConvertNumberToWords {
    public static final String units[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static final String teens[]={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    public static final String tens[]={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int num=scanner.nextInt();
        System.out.println("After Conveting "+num+" to words : "+convertToWords(num));
        scanner.close();
    }
    public static String convertToWords(int num){
        if(num==0){
            return "zero";
        }

        StringBuilder sb=new StringBuilder();

        int thousands=num/1000;
        int hundreds=(num%1000)/100;
        int tensPart=(num%100)/10;
        int ones=num%10;

        if(thousands>0){
            sb.append(units[thousands]).append(" thousand ");
        }
        if(hundreds>0){
            sb.append(units[hundreds]).append(" hundred ");
        }
        if(tensPart==1){
            sb.append(teens[ones]).append(" ");
        }else{
            if(tensPart>1){
                sb.append(tens[tensPart]).append(" ");
            }
            if(ones>0){
                sb.append(units[ones]).append(" ");
            }
        }
        return sb.toString().trim();
    }
}

/*
My Output : 
Enter The Number : 7824
After Conveting 7824 to words : seven thousand eight hundred twenty four

Enter The Number : 378
After Conveting 378 to words : three hundred seventy eight
 */