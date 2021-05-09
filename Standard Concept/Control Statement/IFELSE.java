import java.util.*;

class IFELSE
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        if(num1!=num2)
        {
            System.out.println("Number 1 is not equal to Number 2");
        }
        else if(num1==num2)
        {
            System.out.println("Number 1 and Number 2 equal");
        }
        else
        {
            System.out.println("Please Enter Valid Number!!!");
        }
    }
}