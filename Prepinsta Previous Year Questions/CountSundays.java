/*
Jack is always excited about sunday. It is favourite day, when he gets to play all day. And goes to cycling with his friends. 

So every time when the months starts he counts the number of sundays he will get to enjoy. Considering the month can start with any day, be it Sunday, Monday…. Or so on.

Count the number of Sunday jack will get within n number of days.

Example 1:

Input 

mon-> input String denoting the start of the month.

13-> input integer denoting the number of days from the start of the month.

Output :

2 -> number of days within 13 days.

Explanation:

The month start with mon(Monday). So the upcoming sunday will arrive in next 6 days. And then next Sunday in next 7 days and so on.

Now total number of days are 13. It means 6 days to first sunday and then remaining 7 days will end up in another sunday. Total 2 sundays may fall within 13 days.
 */

import java.util.*;

public class CountSundays {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Start of the Month : ");
        String firstDay=scanner.nextLine();
        System.out.print("Enter No of Days from start of the month : ");
        int days=scanner.nextInt();
        List<String> list=Arrays.asList("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday");
        int startIndex=list.indexOf(firstDay);
        int firstSunday=(7-startIndex)%7;
        if(firstSunday==0){
            firstSunday=7;
        }
        int count=0;
        for(int i=firstSunday;i<=days;i+=7){
            count++;
        }
        System.out.println(count+" Number of Sundays in "+days+" days ");
        scanner.close();
    }    
}

/*
My Output :
Enter the Start of the Month : Monday
Enter No of Days from start of the month : 13
2 Number of Sundays in 13 days
 */