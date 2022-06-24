package InheritanceDemos;

public class House {

    String color = "White";

    void display()
    {
        System.out.println("House display");
    }

    House()
    {
        System.out.println("inside House constructor");
    }

    House(int a)
    {
        System.out.println("a="+a);
        System.out.println("printing a");
    }

}

class Wall extends House
{
    // String color = "White";
    Wall()
    {
        super(10);
        System.out.println("inside wall constructor");
    }


    String color = "Green";

    void display()
    {
        System.out.println("Wall display");
    }

    void printColor()
    {
        System.out.println(color);
        System.out.println(super.color);
        super.display();
    }

    public static void main(String[] args) {
        Wall w = new Wall();
       // w.printColor();

    }
}
