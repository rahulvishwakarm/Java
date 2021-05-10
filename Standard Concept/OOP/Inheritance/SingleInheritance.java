class Animal
{
    void eat()
    {
        System.out.println("Dog is eating..");
    }
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog is barking..");
    }
}

class SingleInheritnace
{
    public static void main(String args[])
    {
        Dog dg = new Dog();
        dg.eat();
        dg.bark();
    }
}