package com.oops;

public class Cars {
    public int id;
    public String name;
    public int year;
    public String color;


    public Cars(int id, String name, int year, String color){
        this.id = id;
        this.name = name;
        this.year = year;
        this.color = color;
    }
    public Cars(){

    }

    public void move(){
        System.out.println("This car moves");
    }

    public void stop(){
        System.out.println("The car stops");
    }

    public static void main(String[] args) {

    }
}
