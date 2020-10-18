package com.mashibing.generics;

public class GenericsClass implements GenericsInterface<String> {
    // limited the String type as the generics from the interface

    @Override
    public <Q> void doSomething(Q s) {
        //inherit the generics from interface
        System.out.println(s);
    }

    @Override
    public String gotSomething() {
        return new String("Hello");
    }
}
