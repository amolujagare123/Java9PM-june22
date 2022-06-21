package ClassesNConstructors;

public class ParameterizedThisConstructor {

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

    ParameterizedThisConstructor(int a, double d , char c, String str)
    {
        this.a = a;
        this.d = d;
        this.c = c;
        this.str = str;
    }

    public static void main(String[] args) {

       ParameterizedThisConstructor ob = new ParameterizedThisConstructor(30,34.2,'l',"selenium");

       ob.display();

        ParameterizedThisConstructor ob2 = new ParameterizedThisConstructor(31,34.2,'l',"selenium");


    }
}
