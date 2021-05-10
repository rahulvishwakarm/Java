class Animal
{
    String color = "Grey White";
}

class Dog extends Animal
{
    String color = "Reg White";
    void printColor()
    {
        System.out.println(color);
        System.out.println(super.color); // super to invoke of methhod animal
    }
}

class SuperToInvokeVariable
{
    public static void main(String args[])
    {
        Dog dg = new Dog();
        dg.printColor();
    }
}