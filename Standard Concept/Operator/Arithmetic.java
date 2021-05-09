import java.util.*;

class Arithmetic
{
    public static void main(String args[])
    {
        System.out.println("Operators");
        System.out.println("Choose your Operation\n 1.Arithmetic\n 2.Assignment \n 3.Logical \n 4.Relational");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choose = sc.nextInt();
        switch(choose){
            case 1:                
                System.out.println("Arithmetic Operator");
                System.out.print("Enter first numeber: ");
                int num1 = sc.nextInt();
                System.out.print("Enter second number: ");
                int num2 = sc.nextInt();
                System.out.print("Addition: ");
                System.out.println(num1+num2);
                System.out.print("Subtraction: ");
                System.out.println(num1-num2);
                System.out.print("Division: ");
                System.out.println(num1/num2);
                System.out.print("Multiplication: ");
                System.out.println(num1*num2);
                System.out.print("Modulus: ");
                System.out.println(num1%num2);
                break;
            case 2:
                System.out.println("Assignment Operator");
                System.out.print("Enter first numeber: ");
                int num3 = sc.nextInt();
                System.out.print("Enter second number: ");
                int num4 = sc.nextInt();
                System.out.print("Addition equal: ");
                System.out.println(num3+=num4);
                System.out.print("Subtraction equal: ");
                System.out.println(num3-=num4);
                System.out.print("Division equal: ");
                System.out.println(num3/=num4);
                System.out.print("Multiplication equal:");
                System.out.println(num3*=num4);
                System.out.print("Modulus equal:");
                System.out.println(num3%=num4);
                break;
            case 3:
                System.out.println("Logical Operator");
                System.out.print("Enter Boolean number 1: ");
                boolean num1_bol = sc.nextBoolean();
                System.out.print("Enter Boolean number 2: ");
                boolean num2_bol = sc.nextBoolean();
                if(num1_bol==true && num2_bol==true)
                {
                    System.out.println("Condition True!!");
                }
                else
                {
                    System.out.println("Condition False!!");
                }  
                break;
            case 4:
                System.out.println("Assignment Operator");
                System.out.print("Enter first numeber: ");
                int num5 = sc.nextInt();
                System.out.print("Enter second number: ");
                int num6 = sc.nextInt();
                System.out.println("Relational Operator");
                System.out.print("Less than equal: ");
                System.out.println(num5<=num6);
                System.out.print("Greater than equal: ");
                System.out.println(num5>=num6);
                break;
            default:
                System.out.print("Please Enter Valid Operation");
                break;
        }
        System.out.println("Operation Performed!!");
    }
}