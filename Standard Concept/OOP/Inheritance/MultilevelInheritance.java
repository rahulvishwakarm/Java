class Bark
{
    void bark()
    {
        System.out.println("Dog is barking...");
    }
}

class Eat extends Bark
{
    void eat()
    {
        System.out.println("Dog is eating...");
    }
}

class MultilevelInheritance extends Eat
{
    public static void main(String args[])
    {
        MultilevelInheritance d1 = new MultilevelInheritance();
        d1.eat();
        d1.bark();
    }
}