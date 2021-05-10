class Student
{
    int rollNO;
    String Name;
    static String College = "NL College";
    //static method to change the value of static variable
    static void change()
    {
        College = "New NL College";
    }

    Student(int r,String n)
    {
        rollNO=r;
        Name=n;
    }

    void display()
    {
        System.out.println(Name+" "+rollNO+" "+College);
    }
}

class StaticMethod
{
    public static void main(String args[])
    {
        Student.change();
        Student s1 = new Student(615,"Name 1");
        Student s2 = new Student(648,"Name 2");
        Student s3 = new Student(652,"Name 3");
        s1.display();
        s2.display();
        s3.display();
    }
}