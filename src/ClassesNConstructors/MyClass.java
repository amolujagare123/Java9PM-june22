package ClassesNConstructors;

import java.util.Date;

public class MyClass {

    int a;
    double d;
    char c;
    String str; // data members

    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

      /*  int x ;
        x = 10 ;
        System.out.println(x);*/

        //Date date = new Date();
        //String str5 = new String("amol");

        MyClass ob = new MyClass();
        ob.a = 89 ;
        ob.d = 56.4;
        ob.c = 'g';
        ob.str = "java";
        ob.display();

        MyClass ob2 = new MyClass();
        ob2.a = 32;
        ob2.d = 11.4;
        ob2.c = 'g';
        ob2.str = "selenium";

        ob2.display();

    }
}
