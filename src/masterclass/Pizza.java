package masterclass;

public class Pizza {
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

