/*
https://www.codechef.com/practice/course/tcs-nqt-questions/TCSNQTC/problems/TCSNQTCP01
 */

import java.util.*;

public class CountPairsDivisibleBy2{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter "+i+" Element : ");
            arr[i]=scanner.nextInt();
        }
        System.out.println("Number of pairs that is divisible by 2 : "+countPairs(size,arr));
        scanner.close();
    }
    public static int countPairs(int n,int arr[]){
        int count_odd=0;
        int count_even=0;
        for(int i:arr){
            if(i%2==0){
                count_even++;
            }else{
                count_odd++;
            }
        }
        int evenPairs=count_even*(count_even-1)/2;
        int oddPairs=count_odd*(count_odd-1)/2;
        return evenPairs+oddPairs;
    }
}

/*
My Output :
Enter the Size : 4
Enter 0 Element : 6
Enter 1 Element : 1
Enter 2 Element : 2
Enter 3 Element : 3
Number of pairs that is divisible by 2 : 2

Enter the Size : 6
Enter 0 Element : 2
Enter 1 Element : 2
Enter 2 Element : 1
Enter 3 Element : 7
Enter 4 Element : 5
Enter 5 Element : 3
Number of pairs that is divisible by 2 : 7
 */