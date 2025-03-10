/*
https://www.codechef.com/practice/course/tcs-nqt-questions/TCSNQTC/problems/TCSNQTCP07
 */

import java.util.*;

public class LongestCommonPrefix {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Number of Strings : ");
        int n=scanner.nextInt();
        String str[]=new String[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter String : ");
            str[i]=scanner.next();
        }
        System.out.println("Longest Common Prefix : "+findLongestCommonPrefix(str));
        scanner.close();
    }
    public static String findLongestCommonPrefix(String str[]){
        if(str.length==0){
            return "-1";
        }
        Arrays.sort(str);
        String first=str[0];
        String last=str[str.length-1];
        int minLength=Math.min(first.length(),last.length());

        int i=0;
        while(i<minLength&&first.charAt(i)==last.charAt(i)){
            i++;
        }

        String prefix=first.substring(0,i);
        return prefix.isEmpty()? "-1":prefix;
    }
}

/*
My Output : 
Enter the Number of Strings : 3
Enter String : flower
Enter String : flow
Enter String : flight
Longest Common Prefix : fl

Enter the Number of Strings : 2 
Enter String : dog
Enter String : racecar
Longest Common Prefix : -1
 */