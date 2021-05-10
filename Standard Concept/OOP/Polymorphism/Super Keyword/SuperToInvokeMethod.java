class Animal
{
    void mthd()
    {
        System.out.println("Inside Animal Methos!!");
    }
}

class Dog extends Animal
{
    void mthd()
    {
        System.out.println("Child Inside Animal Method!!");
    }

    void mthd1()
    {
        System.out.println("Child Inside Animal Method1!!");
    }

    void work()
    {
        super.mthd();  // Super to invoke methos
    }
}

class SuperToInvokeMethod
{
    public static void main(String args[])
    {
        Dog dg = new Dog();
        dg.work();
    }   
}