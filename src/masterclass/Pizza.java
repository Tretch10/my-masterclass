package masterclass;

public class Pizza {
    /*
    Here are some differences between constructors and methods
    1. A constructor does not have a return type while a method can have a return type.
    2. A constructor is used to initialize an object while a method is used to perform a function of an object.
    3. A constructor cannot be inherited by a subclass but a method can.
     */

    int orderNumber;
    String crust;
    String meat;
    String veggies;

    public Pizza(int orderNumber, String crust, String meat, String veggies) {
        this.orderNumber=orderNumber;
        this.crust=crust;
        this.meat=meat;
        this.veggies=veggies;
    }

    public Pizza(int orderNumber, String crust, String meat) {
        this.orderNumber=orderNumber;
        this.crust=crust;
        this.meat=meat;

    }


    public Pizza(int orderNumber, String crust) {
        this.orderNumber=orderNumber;
        this.crust=crust;
        this.veggies=veggies;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Pizza pizza1 = new Pizza(1, "thin crust", "pepperoni", "bell peppers");

        Pizza pizza2 = new Pizza(2, "thick crust", "chicken");

        Pizza pizza3 = new Pizza(3, "stuffed crust", "tomato");

        Pizza pizza4 = new Pizza(4, "thin crust");
    }

}

