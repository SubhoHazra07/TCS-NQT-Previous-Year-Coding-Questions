/*
https://www.codechef.com/practice/course/tcs-nqt-questions/TCSNQTC/problems/TCSNQTCP03
 */

import java.util.*;

public class IdentifyRowWithMost1 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Row Size : ");
        int row=scanner.nextInt();
        System.out.print("Enter the Column Size : ");
        int column=scanner.nextInt();
        int matrix[][]=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print("Enter Element ["+i+"]["+j+"] : ");
                matrix[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Maximum Number of 1's in Row : "+countOnes(row,column,matrix));
        scanner.close();
    }
    public static int countOnes(int n,int m,int arr[][]){
        int max=0;
        int rowIndex=-1;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
            if(count>max){
                max=count;
                rowIndex=i;
            }
        }
        return rowIndex;
    }
}

/*
My Output :
Enter the Row Size : 3
Enter the Column Size : 4
Enter Element [0][0] : 0
Enter Element [0][1] : 1
Enter Element [0][2] : 0
Enter Element [0][3] : 0
Enter Element [1][0] : 1
Enter Element [1][1] : 1
Enter Element [1][2] : 0
Enter Element [1][3] : 0
Enter Element [2][0] : 0
Enter Element [2][1] : 0
Enter Element [2][2] : 0
Enter Element [2][3] : 1
Maximum Number of 1's in Row : 1

Enter the Row Size : 4
Enter the Column Size : 4
Enter Element [0][0] : 1
Enter Element [0][1] : 1
Enter Element [0][2] : 1
Enter Element [0][3] : 0
Enter Element [1][0] : 0
Enter Element [1][1] : 1
Enter Element [1][2] : 1
Enter Element [1][3] : 0
Enter Element [2][0] : 0
Enter Element [2][1] : 1
Enter Element [2][2] : 1
Enter Element [2][3] : 1
Enter Element [3][0] : 1
Enter Element [3][1] : 1
Enter Element [3][2] : 1
Enter Element [3][3] : 1
Maximum Number of 1's in Row : 3

Enter the Row Size : 2
Enter the Column Size : 1
Enter Element [0][0] : 0
Enter Element [1][0] : 0
Maximum Number of 1's in Row : -1
 */
