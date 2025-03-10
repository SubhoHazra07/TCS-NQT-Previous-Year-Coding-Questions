/*
https://www.codechef.com/practice/course/tcs-nqt-questions/TCSNQTC/problems/TCSNQTCP08
 */

import java.util.*;

public class UnionOfSortedArray {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Size of First Array : ");
        int size1=scanner.nextInt();
        int arr1[]=new int[size1];
        for(int i=0;i<size1;i++){
            System.out.print("Enter "+i+" Element : ");
            arr1[i]=scanner.nextInt();
        }
        System.out.print("Enter the Size of Second Array : ");
        int size2=scanner.nextInt();
        int arr2[]=new int[size2];
        for(int i=0;i<size2;i++){
            System.out.print("Enter "+i+" Element : ");
            arr2[i]=scanner.nextInt();
        }
        ArrayList<Integer> list=union(arr1,arr2);
        System.out.print("Union of Two Sorted Array is : ");
        for(int i:list){
            System.out.print(i+" ");
        }
        scanner.close();
    }
    public static ArrayList<Integer> union(int arr1[],int arr2[]){
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr1){
            set.add(i);
        }
        for(int j:arr2){
            set.add(j);
        }
        ArrayList<Integer> list=new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}

/*
My Output : 
Enter the Size of First Array : 5
Enter 0 Element : 1
Enter 1 Element : 3
Enter 2 Element : 4
Enter 3 Element : 5
Enter 4 Element : 7
Enter the Size of Second Array : 4
Enter 0 Element : 2
Enter 1 Element : 3
Enter 2 Element : 5
Enter 3 Element : 10
Union of Two Sorted Array is : 1 2 3 4 5 7 10

Enter the Size of First Array : 3
Enter 0 Element : 11
Enter 1 Element : 12
Enter 2 Element : 13
Enter the Size of Second Array : 2
Enter 0 Element : 14
Enter 1 Element : 25
Union of Two Sorted Array is : 11 12 13 14 25
 */