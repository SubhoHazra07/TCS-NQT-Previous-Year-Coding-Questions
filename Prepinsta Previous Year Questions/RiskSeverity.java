/*
Airport security officials have confiscated several item of the passengers at the security check point. All the items have been dumped into a huge box (array). Each item possesses a certain amount of risk[0,1,2]. Here, the risk severity of the items represent an array[] of N number of integer values. The task here is to sort the items based on their levels of risk in the array. The risk values range from 0 to 2.

Example :

Input :

7  -> Value of N

[1,0,2,0,1,0,2]-> Element of arr[0] to arr[N-1], while input each element is separated by new line.

Output :

0 0 0 1 1 2 2  -> Element after sorting based on risk severity 

Example 2:

input : 10  -> Value of N 

[2,1,0,2,1,0,0,1,2,0] -> Element of arr[0] to arr[N-1], while input each element is separated by a new line.

Output : 

0 0 0 0 1 1 1 2 2 2  ->Elements after sorting based on risk severity.

Explanation:

In the above example, the input is an array of size N consisting of only 0’s, 1’s and 2s. The output is a sorted array from 0 to 2 based on risk severity.
 */

import java.util.*;

public class RiskSeverity {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter "+i+" Element : ");
            arr[i]=scanner.nextInt();
        }
        //It can simply done by Arrays.sort(arr) but I used Merge Sort for my Practice Purpose
        mergeSort(arr,0,size-1);
        System.out.print("Sorted Array is : ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        scanner.close();
    }
    public static void mergeSort(int []arr,int left,int right){
        if(left<right){
            int mid=left+(right-left)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }
    public static void merge(int arr[],int left,int mid,int right){
        int size1=mid-left+1;
        int size2=right-mid;
        int leftArray[]=new int[size1];
        int rightArray[]=new int[size2];

        System.arraycopy(arr,left,leftArray,0,size1);
        System.arraycopy(arr,mid+1,rightArray,0,size2);

        int i=0,j=0,k=left;
        while(i<size1&&j<size2){
            if(leftArray[i]<=rightArray[j]){
                arr[k]=leftArray[i];
                i++;
            }else{
                arr[k]=rightArray[j];
                j++;
            }
            k++;
        }

        while(i<size1){
            arr[k]=leftArray[i];
            i++;
            k++;
        }

        while(j<size2){
            arr[k]=rightArray[j];
            j++;
            k++;
        }
    }
}

/*
My Output :
Enter the size : 7
Enter 0 Element : 1
Enter 1 Element : 0
Enter 2 Element : 2
Enter 3 Element : 0
Enter 4 Element : 1
Enter 5 Element : 0
Enter 6 Element : 2
Sorted Array is : 0 0 0 1 1 2 2
 */