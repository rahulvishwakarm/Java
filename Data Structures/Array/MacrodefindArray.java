import java.util.*;

class MacrodefindArray
{
    private static final int siz = 6;

    public static void main(String[] args)
    {
        // Initializing an array
        Scanner sc = new Scanner(System.in);
        int arr[];
        arr=new int[siz];

        // Assigning the value to an element
        for(int i=0;i<siz;i++)
        {
            System.out.print("Enter the elemnt at index "+i+":");
            arr[i] = sc.nextInt();
        }

        // Accessing the element in an array
        System.out.println("Elements in an array are: ");
        for(int j=0;j<siz;j++)
        {
            System.out.print(arr[j]+"\t");
        }
    }
}