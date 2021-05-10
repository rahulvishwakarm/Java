import java.util.*;


class NewThisClassMethod
{
    void m()
    {
        System.out.println("Method m Invoked!!");
    }

    void n()
    {
        System.out.println("Method n Invoked!!");
        this.m();
    }
}

class ThisClassMethod
{
    public static void main(String args[])
    {
        NewThisClassMethod sc1 = new NewThisClassMethod();
        sc1.n();
    }
}