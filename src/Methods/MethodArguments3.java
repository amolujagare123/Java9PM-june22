package Methods;

import ClassesNConstructors.MyClass;

public class MethodArguments3 {

    void setMyObject(MyClass obj)
    {
        obj.a = 10;
        obj.d = 10.1;
        obj.c = 'a';
        obj.str = "amol";
    }

    public static void main(String[] args) {
        MethodArguments3 ob = new MethodArguments3();
        MyClass  myClass = new MyClass();

        ob.setMyObject(myClass);
        myClass.display();
    }
}
