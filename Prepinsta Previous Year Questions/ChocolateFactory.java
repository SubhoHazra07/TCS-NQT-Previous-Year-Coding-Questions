/*
Problem Statement –

A chocolate factory is packing chocolates into the packets. The chocolate packets here represent an array  of N number of integer values. The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).

Example 1 :

N=8 and arr = [4,5,0,1,9,0,5,0].

There are 3 empty packets in the given set. These 3 empty packets represented as O should be pushed towards the end of the array

Input :

8  – Value of N

[4,5,0,1,9,0,5,0] – Element of arr[O] to arr[N-1],While input each element is separated by newline

Output:

4 5 1 9 5 0 0 0

Example 2:

Input:

6 — Value of N.

[6,0,1,8,0,2] – Element of arr[0] to arr[N-1], While input each element is separated by newline

Output:

6 1 8 2 0 0
 */

import java.util.*;

public class ChocolateFactory{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter "+i+" Element : ");
            arr[i]=scanner.nextInt();
        }
        int result[]=findEmptyPackets(arr,size);
        System.out.print("Updated packets are : ");
        for(int i=0;i<size;i++){
            System.out.print(result[i]+" ");
        }
        scanner.close();
    }
    public static int[] findEmptyPackets(int arr[],int n){
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        for(int i=j;i<n;i++){
            arr[i]=0;
        }
        return arr;
    }
}

/*
My Output : 
Enter the size : 8
Enter 0 Element : 4
Enter 1 Element : 5
Enter 2 Element : 0
Enter 3 Element : 1
Enter 4 Element : 9
Enter 5 Element : 0
Enter 6 Element : 5
Enter 7 Element : 0
Updated packets are : 4 5 1 9 5 0 0 0
 */