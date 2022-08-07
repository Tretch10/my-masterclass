package com.oops;

public class Toyota extends Cars{
    String dealer;

    public Toyota(int id, String name, int year, String color, String dealer){
        super(id,name,year,color);
        this.dealer = dealer;

    }

    public static void main(String[] args) {
        Toyota toyota = new Toyota(1, "Camry", 2019, "White", "Jimmy J");
        Toyota toyota1 = new Toyota(2, "Corolla", 2020, "Red", "Park Place");
        Cars cars = new Cars();
        cars.stop();
        toyota1.stop();

        toyota.move();
    }
}
