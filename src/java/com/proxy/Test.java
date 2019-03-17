package com.proxy;

public class Test {

    public static void main(String[] args) {
        Person proxy = (Person) new YJMeipo().getInstance(new boy());
        proxy.findlove();

    }
}
