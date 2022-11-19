package com.oops;

@FunctionalInterface
public interface Logic {

//    static void print();
//
//    static void print();

    int addNumbers(int x, int y);

    default int subtractNumbers(int x, int y){
        return x - y;
    }
    default int multiplyNumbers(int x, int y){
        return x * y;
    }

    static void print(){
        System.out.println("Message is printed");
    }
}
