class Animal
{
    void name()
    {
        System.out.println("German Sheppard");
    }
}

class Eat extends Animal
{
    void eat_dog()
    {
        System.out.println("Dog is eating...");
    }
}

class Bark extends Animal
{
    void bark_dog()
    {
        System.out.println("Dog is barking...");
    }
}

class HierarchicalInheritance
{
    public static void main(String args[])
    {
        Bark bk = new Bark();
        Eat et = new Eat();
        bk.bark_dog();
        et.eat_dog();
    }
}