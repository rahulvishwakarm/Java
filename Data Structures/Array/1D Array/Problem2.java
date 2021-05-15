// Write the program to check whether any of the digits in a number apperars more than once
import java.util.*;

class Problem2
{
    public static void main(String[] args)
    {
        int arr[] = {3,4,6,8,9,5,3,3};
        Scanner sc=new Scanner(System.in);
        System.out.print("Which number do you want to search in an array arr: ");
        int srch = sc.nextInt();
        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
                if(arr[i]==srch)
                {
                    count=count+1;
                }
        }
        System.out.print(srch+" is repeated "+count +" times");
    }
}