package ClassesNConstructors;

public class MyClass3 {

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

    MyClass3()
    {
       a = 10;
       d = 12.3;
       c = 'a';
       str = "java";
    }

    public static void main(String[] args) {

       MyClass3 ob = new MyClass3();


       ob.display();
    }
}
