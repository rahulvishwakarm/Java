abstract class Shape
{
    abstract void draw();
}

class Rectangle extends Shape
{
    void draw()
    {
        System.out.println("Drawing Rectnagle");
    }
}

class Circle extends Shape
{
    void draw()
    {
        System.out.println("Drawing Circle");
    }
}

class RealSnerioAbstractClass
{
    public static void main(String args[])
    {
        Shape sp = new Circle();
        Shape rt = new Rectangle();
        sp.draw();
        rt.draw();
    }
}