package com.works.useAbstract;

abstract public class Person {

    abstract public long tcNo();

    public long total() {
        long tc = tcNo();
        long total = 0;
        if (tc == 100) {
            total = 100000;
        }else if (tc == 1000) {
            total = 10000;
        }
        return total;
    }

    public String name(){
        long tc = tcNo();
        String name = "";
        if (tc == 100) {
            name = "Ali Bilmem";
        }else if (tc == 1000) {
            name = "Zehra Bilsin";
        }
        return name;
    }

}
