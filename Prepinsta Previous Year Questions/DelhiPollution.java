/*
Problem Statement

Particulate matters are the biggest contributors to Delhi pollution. The main reason behind the increase in the concentration of PMs include vehicle emission by applying Odd Even concept for all types of vehicles. The vehicles with the odd last digit in the registration number will be allowed on roads on odd dates and those with even last digit will on even dates.

Given an integer array a[], contains the last digit of the registration number of N vehicles traveling on date D(a positive integer). The task is to calculate the total fine collected by the traffic police department from the vehicles violating the rules.

Note : For violating the rule, vehicles would be fined as X Rs.

Example 1:

Input :

4 -> Value of N

{5,2,3,7} -> a[], Elements a[0] to a[N-1], during input each element is separated by a new line

12 -> Value of D, i.e. date 

200 -> Value of x i.e. fine

Output :

600  -> total fine collected 

Explanation:

Date D=12 means , only an even number of vehicles are allowed. 

Find will be collected from 5,3 and 7 with an amount of 200 each.

Hence, the output = 600.

Example 2:

Input :

5   -> Value of N 

{2,5,1,6,8}  -> a[], elements a[0] to a[N-1], during input each element is separated by new line

3 -> Value of D i.e. date 

300 -> Value of X i.e. fine 

Output :

900  -> total fine collected 

Explanation:

Date D=3 means only odd number vehicles with are allowed.

Find will be collected from 2,6 and 8 with an amount of 300 each.

Hence, the output = 900 

Constraints:

0<N<=100
1<=a[i]<=9
1<=D <=30
100<=x<=5000 
The input format for testing 

The candidate has to write the code to accept 4 input(s).

First input – Accept for N(Positive integer) values (a[]), where each value is separated by a new line.

Third input – Accept value for D(Positive integer)

Fourth input – Accept value for X(Positive integer )

The output format for testing 

The output should be a positive integer number (Check the output in Example 1, Example e) if no fine is collected then print ”0”.


 */

import java.util.*;

public class DelhiPollution {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter "+(i+1)+" Vechile Last Digit Registration No : ");
            arr[i]=scanner.nextInt();
        }
        System.out.print("Enter Travelling Date : ");
        int date=scanner.nextInt();
        System.out.print("Value of Fine : ");
        int fine=scanner.nextInt();
        System.out.println("Total Collected Fine is : "+fineCollection(size,arr,date,fine));
        scanner.close();
    }
    public static int fineCollection(int n,int arr[],int d,int x){
        int totalFine=0;
        for(int i=0;i<n;i++){
            if(d%2==0&&arr[i]%2!=0){
                totalFine+=x;
            }else if(d%2!=0&&arr[i]%2==0){
                totalFine+=x;
            }
        }
        return totalFine;
    }
}

/*
My Output :
Enter the Size : 4
Enter 1 Vechile Last Digit Registration No : 5
Enter 2 Vechile Last Digit Registration No : 2
Enter 3 Vechile Last Digit Registration No : 3
Enter 4 Vechile Last Digit Registration No : 7
Enter Travelling Date : 12
Value of Fine : 200
Total Collected Fine is : 600

Enter the Size : 5
Enter 1 Vechile Last Digit Registration No : 2
Enter 2 Vechile Last Digit Registration No : 5
Enter 3 Vechile Last Digit Registration No : 1
Enter 4 Vechile Last Digit Registration No : 6
Enter 5 Vechile Last Digit Registration No : 8
Enter Travelling Date : 3 
Value of Fine : 300
Total Collected Fine is : 900
 */