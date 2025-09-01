package com.works;

import com.works.models.Customer;
import com.works.oop.Action;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer();
        c1.setFirstName("Ali");
        c1.setLastName("Bilmem");

        Customer c2 = new Customer();
        c2.setFirstName("Ali");
        c2.setLastName("Bilmem");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1);

        System.out.println( c1.equals(c2) );
        String a = "Ali";
        String b = "Ali";
        System.out.println( (a.equals(b))) ;
        System.out.println( a == b );

        // ------------------------------------------------------
        Action action = new Action(); // i değişkeni burada oluştu
        //System.out.println(action.i); // i değişkeni burada oluştu

    }
}