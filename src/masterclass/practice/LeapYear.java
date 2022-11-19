package masterclass.practice;

public class LeapYear {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2006));

    }

    public static boolean isLeapYear(int year){
        if(year%4 == 0){
            return true;
        }
        return false;
    }
}
