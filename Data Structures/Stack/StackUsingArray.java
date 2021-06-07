import java.util.*;

class StackUsingArray
{
    public static int MAX = 5;
    public static int arr[] = new int[MAX];
    public static int top = -1;

    public static void main(String[] args)
    {
        System.out.println("1. PUSH or Insert");
        System.out.println("2. POP or Delete");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        while(true)
        {
            System.out.print("Choose the Option:");
            Scanner sc = new Scanner(System.in);
            int tm = sc.nextInt();

            switch(tm)
            {
                case 1:
                {
                    push();
                    break;
                }
                case 2:
                {
                    pop();
                    break;
                }
                case 3:
                {
                    display();
                    break;
                }
                case 4:
                {
                    System.exit(0);
                }
                default:
                {
                    System.out.print("Invalid Input!!\n");
                }
            }
        }
    }

    static void push()
    {
        if(top==MAX-1)
        {
            System.out.print("Stack is full, Overflow!!\n");
        }
        else
        {
            System.out.print("Enter the data: ");
            Scanner sc1 = new Scanner(System.in);
            int data = sc1.nextInt();
            top++;
            arr[top] = data;
        }
    }

    static void pop()
    {   
        if(top==-1)
        {
            System.out.print("Stack is Empty, Underflow!!"+"\n");
        }
        else
        {
            System.out.print("Popped Element: "+arr[top]);
            top--;
        }
    }

    static void display()
    {
        if(top==-1)
        {
            System.out.print("Stack is empty!!"+"\n");
        }
        System.out.print("Elements: ");
        for(int i=top;i>=0;i--)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}