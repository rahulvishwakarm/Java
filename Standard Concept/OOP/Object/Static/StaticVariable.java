class Student
{
    int rollNo;
    String name;
    static String College = "NL College"; //Static Variable
    Student(int r,String n) {
        rollNo=r;
        name=n;
    }

    void display()
    {
        System.out.println(name+" "+rollNo+" "+College);
    }
}


class StaticVariable
{
    public static void main(String args[])
    {   
        Student s1 = new Student(615,"Rahul Vishwakarma");
        Student s2 = new Student(648,"Random name");
        s1.display();
        s2.display();
    }
}