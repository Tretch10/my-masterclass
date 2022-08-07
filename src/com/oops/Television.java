package com.oops;

public class Television {
    void choice(){
        System.out.println("Full TV choice");
    }

    void play(){
        System.out.println("TV show is playing...");
    }

    void stop(){
        System.out.println("TV show stopped");
    }

}


class Horror extends Television{
    @Override
    void choice(){
        System.out.println("Full Horror choice");
    }
    void play(){
        System.out.println("TV show is playing...");
    }


    public static void main(String[] args) {
        Television television = new Television();
        Television television2 = new Horror();
        television.choice();
        television2.choice();
    }


}