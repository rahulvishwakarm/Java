import java.util.*;

class Switch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choose 1 2 or 3: ");
        int num1 = sc.nextInt();
        switch (num1) {
            case 1:
                System.out.println("One Selected");
                break;
            case 2:
                System.out.println("Two Selected");
                break;
            case 3:
                System.out.println("Three Selected");
                break;
            default:
                break;
        }
        System.out.print("Operation Performed!!");
    }
}