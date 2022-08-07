public class Day {
    enum DaysOfTheWeek{MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY}
    DaysOfTheWeek days;


    public static void main(String[] args) {
        Day day1 = new Day();
        day1.days = DaysOfTheWeek.MONDAY;
        System.out.println(day1.days);

    }
}
