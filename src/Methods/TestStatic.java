package Methods;

import staticFinal.StaticMethodDemo;

/*

import static staticFinal.StaticMethodDemo.staticMethod1;
import static staticFinal.StaticMethodDemo.staticMethod2;
import static staticFinal.StaticMethodDemo.college;

*/

import static staticFinal.StaticMethodDemo.*;


public class TestStatic {

    public static void main(String[] args) {

        StaticMethodDemo ob = new StaticMethodDemo();
        staticMethod1();
        ob.staticMethod2(); // using object

        staticMethod1();
        StaticMethodDemo.staticMethod2();// using class name


        staticMethod1();
        staticMethod2();
        college = "my college";
    }
}
