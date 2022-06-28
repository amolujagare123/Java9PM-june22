package staticFinal;

public class FinalVarible {

    final int speed = 200;

    void change()
    {
        //speed = 100;
    }

    public static void main(String[] args) {
        FinalVarible ob = new FinalVarible();
        ob.change();
        System.out.println(ob.speed);
    }

}
