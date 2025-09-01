package com.works.inheritance;

public class MainMiras {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();

        globalPrint(a);
        globalPrint(b);
        globalPrint(c);

    }

    public static void globalPrint( Base obj ) {
        if (obj instanceof A) {
            A a = (A) obj;
            a.sum();
        }
        obj.print();
    }


}
