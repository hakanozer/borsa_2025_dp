package com.works.useAbstract;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

abstract public class User {

    abstract public HttpRequest request();
    abstract public HttpResponse response();

    public void call() {
        System.out.println("call");
    }

    public void call2() {
        System.out.println("call2");
    }

    public void call3() {
        System.out.println("call3");
    }

}
