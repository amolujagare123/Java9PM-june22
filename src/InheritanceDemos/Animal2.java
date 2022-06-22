package InheritanceDemos;

public class Animal2 {

    void eat()
    {
        System.out.println("eat");
    }
}

class Mammal extends Animal2
{
    void walk()
    {
        System.out.println("walk");
    }
}

class Reptile extends Animal2
{
    void crawl()
    {
        System.out.println("crawl");
    }
}

class Tiger extends Mammal
{
    void roar()
    {
        System.out.println("roar");
    }
}

class TestInheritance3
{
    public static void main(String[] args) {

        Animal2 a = new Animal2();
        a.eat();

        Mammal m = new Mammal();
        m.walk();
        m.eat();

        Reptile r = new Reptile();
        r.crawl();
        r.eat();

        Tiger t = new Tiger();
        t.roar();
        t.walk();
        t.eat();


    }
}