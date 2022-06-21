package ClassesNConstructors;

public class ParameterizedConstructor {

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

    ParameterizedConstructor(int a1, double d1 , char c1,String str1)
    {
       a = a1;
       d = d1;
       c = c1;
       str = str1;
    }

    public static void main(String[] args) {

       ParameterizedConstructor ob = new ParameterizedConstructor(30,34.2,'l',"selenium");


       ob.display();
    }
}
