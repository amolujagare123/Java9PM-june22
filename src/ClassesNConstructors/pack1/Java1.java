package ClassesNConstructors.pack1;

public class Java1 {

    public int a;
   /* private*/ double d;
    protected char c;
    String str; // data members

    public void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        Java1 ob = new Java1();

        ob.a = 89 ;
        ob.d = 56.4;
        ob.c = 'g';
        ob.str = "java";

        ob.display();

    }
}
