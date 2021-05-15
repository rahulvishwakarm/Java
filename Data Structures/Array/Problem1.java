// Write the program to reverse the following given sequence in an array
// 34 56 54 32 67 89 90 32 21

class Problem1
{
    public static void main(String[] args)
    {
        int arr[] = {34,56,54,67,89,90,32,21};
        System.out.println("Element in an array: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }

        System.out.println("Element in reverse order: ");
        for(int j=arr.length-1;j>=0;j--)
        {
            System.out.print(arr[j]+"\t");
        }
    }
}