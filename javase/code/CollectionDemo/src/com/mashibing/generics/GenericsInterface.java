package com.mashibing.generics;

public interface GenericsInterface<T> {

    <Q> void doSomething(Q t);

    T gotSomething();
}
