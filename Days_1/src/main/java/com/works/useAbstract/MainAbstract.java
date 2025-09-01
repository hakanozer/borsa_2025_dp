package com.works.useAbstract;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MainAbstract {

    public static void main(String[] args) {

        Customer c = new Customer();
        System.out.println( c.name() );
        System.out.println( c.total() );

        Person person = new Person() {
            @Override
            public long tcNo() {
                return 1000;
            }
        };
        System.out.println(person.name());
        System.out.println(person.total());

        User user = new User() {
            @Override
            public HttpRequest request() {
                return null;
            }

            @Override
            public HttpResponse response() {
                return null;
            }
        };

    }

}
