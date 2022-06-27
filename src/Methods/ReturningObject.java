package Methods;

import ClassesNConstructors.MyClass;

public class ReturningObject {

    MyClass getMyObject()
    {
        MyClass obj = new MyClass();
        obj.a = 10;
        obj.d = 10.1;
        obj.c = 'a';
        obj.str = "amol";
        return obj;
    }

    public static void main(String[] args) {
        ReturningObject ob = new ReturningObject();

        MyClass myClass =  ob.getMyObject();
        myClass.display();
        //myClass.display();
        ob.getMyObject().display();
   }
}
