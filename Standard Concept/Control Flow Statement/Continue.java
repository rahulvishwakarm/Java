import java.util.*;

class Continue
{
    public static void main(String args[])
    {
        System.out.println("Break Statement");
        String names[]={"Test1","Test2","Test3","Test4","Test5","Rahul","Test6","Test7"};
        for(String i:names) {
            if(i=="Rahul")
            {
                System.out.println("Rahul");
                continue;
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}