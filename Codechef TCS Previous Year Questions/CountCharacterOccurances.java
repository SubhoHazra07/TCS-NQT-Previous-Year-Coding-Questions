/*
https://www.codechef.com/practice/course/tcs-nqt-questions/TCSNQTC/problems/TCSNQTCP04
 */

import java.util.*;

public class CountCharacterOccurances {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter String 1 : ");
        String str1=scanner.nextLine();
        System.out.print("Enter String 2 : ");
        String str2=scanner.nextLine();
        System.out.println("Total Number of characters in String 2 found in String 1 : "+totalCount(str1,str2));
        scanner.close();
    }
    public static int totalCount(String str1,String str2){
        HashSet<Character> set=new HashSet<>();
        for(char c:str2.toCharArray()){
            set.add(c);
        }
        int count=0;
        for(char c:str1.toCharArray()){
            if(set.contains(c)){
                count++;
            }
        }
        return count;
    }
}

/*
My Output : 
Enter String 1 : helloworld
Enter String 2 : do
Total Number of characters in String 2 found in String 1 : 3

Enter String 1 : abacabadabacaba
Enter String 2 : abcd
Total Number of characters in String 2 found in String 1 : 15

Enter String 1 : abc
Enter String 2 : abcdabcdabcdabcd
Total Number of characters in String 2 found in String 1 : 3
 */