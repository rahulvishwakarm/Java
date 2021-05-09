import java.util.*;

class Break
{
    public static void main(String args[])
    {
        System.out.println("Break Statement");
        String names[]={"Test1","Test2","Test3","Test4","Test5","Rahul","Test6","Test7"};
        for(String i:names) {
            if(i=="Rahul")
            {
                System.out.println("Rahul");
                break;
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}