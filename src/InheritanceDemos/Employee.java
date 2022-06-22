package InheritanceDemos;

public class Employee {

    int salary = 15000;

    void display()
    {
        System.out.println("inside employee");
    }

}

class Programmer extends Employee
{
    int bonus = 5000;


    void myMethod()
    {
        System.out.println("Below is the bonus");
        System.out.println(bonus);
    }

    public static void main(String[] args) {

        Programmer p = new Programmer();

        System.out.println(p.bonus);

       System.out.println(p.salary);

       p.myMethod();
       p.display();

    }
}