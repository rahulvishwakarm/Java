abstract class Animal
{
    abstract void dog();
}

class AbstractClass extends Animal
{
    void dog()
    {
        System.out.println("Testing ");
    }

    public static void main(String args[])
    {
        Animal obj = new AbstractClass();
        obj.dog();  
    }
}