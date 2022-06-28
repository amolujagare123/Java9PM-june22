package staticFinal;

public class Student {

    int rno;
    String name;
    static String college="ITC";

    void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.rno = 1;
        s1.name = "Dhanya";


        s2.rno = 2;
        s2.name = "Hemant";
        s2.college="Pune college";

        s3.rno = 3;
        s3.name = "John";

        System.out.println("printing college name using class name");
        System.out.println(Student.college);

        Student.college = "PICT";
        Student.college = "ITC";

        s1.display();
        s2.display();
        s3.display();

    }

}
