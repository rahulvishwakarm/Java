import java.util.*;

class ThreeDArray
{
    public static void main(String[] args)
    {
        int arr[][][] = {    {{3,4,5},{9,8,7},{0,1,3}},
                            {{43,5,67},{98,66,32},{97,67,43}}
                        };
        System.out.println("Accessing all element");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                {
                    System.out.print(arr[i][j][k]+" ");
                }
            }
        }
    }
}