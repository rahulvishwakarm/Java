import java.util.*;

class NewThisinstance
{
    int rollNo;
    String name;
    float fee;
    NewThisinstance(int rollNo,String name,float fee)
    {
        this.rollNo=rollNo;
        this.name=name;
        this.fee=fee;
    }

    void display()
    {
        System.out.println(rollNo+" "+name+" "+fee);
    }
}

class ThisInstance
{
    public static void main(String args[])
    {
        NewThisinstance NS1 = new NewThisinstance(615,"Name One",5000f);
        NewThisinstance NS2= new NewThisinstance(648,"Name Two",6000f);
        NS1.display();
        NS2.display();
    }
}