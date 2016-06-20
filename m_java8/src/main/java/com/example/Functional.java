package com.example;

/**
 * Created by wss on 6/16/16.
 */

public interface Functional {
    void method();

    default void defaultMethod() {
        System.out.print("default");
    }
}
