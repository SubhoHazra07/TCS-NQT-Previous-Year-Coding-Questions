/*
https://www.codechef.com/practice/course/tcs-nqt-questions/TCSNQTC/problems/TCSNQTCP09
 */

import java.util.*;

public class FindEquilibriumPoint {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter "+i+" Element : ");
            arr[i]=scanner.nextInt();
        }
        System.out.println("Equilibrium Point of The Array is : "+findEquilibriumPoint(size,arr)+" index ");
        scanner.close();
    }
    public static int findEquilibriumPoint(int n,int arr[]){
        int totalSum=0;
        for(int i:arr){
            totalSum+=i;
        }
        int leftSum=0;
        int rightSum=totalSum;
        for(int i=0;i<n;i++){
            rightSum-=arr[i];
            if(leftSum==rightSum){
                return i;
            }
            leftSum+=arr[i];
        }
        return -1;
    }
}

/*
My Output :
Enter the Size : 5
Enter 0 Element : 1
Enter 1 Element : -1
Enter 2 Element : 2
Enter 3 Element : 1
Enter 4 Element : -2
Equilibrium Point of The Array is : 0 index

Enter the Size : 3
Enter 0 Element : 1
Enter 1 Element : -1
Enter 2 Element : 4
Equilibrium Point of The Array is : 2 index

Enter the Size : 6
Enter 0 Element : 1
Enter 1 Element : 2
Enter 2 Element : 3
Enter 3 Element : 4
Enter 4 Element : 5
Enter 5 Element : 6
Equilibrium Point of The Array is : -1 index
 */