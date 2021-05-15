import java.util.*;

class TwoDArray
{
    public static void main(String[] args)
    {
        int arr[][] = {{3,4,6},{7,5,3}};
        System.out.print("Accessing all element: ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]);
            }
        }
    }
}