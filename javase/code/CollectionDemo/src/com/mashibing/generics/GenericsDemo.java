package com.mashibing.generics;

public class GenericsDemo {
    public static void main(String[] args) {
        GenericsInterface a = new GenericsClass();
        System.out.println(a.gotSomething());
        a.doSomething(555);

    }
}
