import java.util.Random;

public class Main {
    public static void main(String[] args) {

        DayOfTheWeek weekDay = DayOfTheWeek.TUES;
        System.out.println(weekDay);

        for (int i = 0; i < 3; i++ ) {
            weekDay = getRandomDay();

            System.out.printf("Name is %s, Ordinal Value = %d%n",
                    weekDay.name(), weekDay.ordinal()); // .name will print the enum value such as TUES while the
            //ordinal will print the equivalnt of the Enum index, in this case '2'

            if (weekDay == DayOfTheWeek.FRI) {
                System.out.println("Found a Friday!!!");
            }
            switchDayOfWeek(weekDay);
        }
    }

    public static void switchDayOfWeek(DayOfTheWeek weekDay) {

        int weekDayInteger = weekDay.ordinal() + 1;
        switch (weekDay) {
            case WED -> System.out.println("Wednesday is Day " + weekDayInteger);
            case SAT -> System.out.println("Saturday is Day " + weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0)
                    + weekDay.name().substring(1).toLowerCase() +
                    "day is Day " + weekDayInteger); // this generates the full name value of the weekday, but not
            // sure how or why is it inferring a value since enum is a constant and there is no index past index 2
        }
    }


    public static DayOfTheWeek getRandomDay() {

        int randomInteger = new Random().nextInt(7); //random integer created and limited thee possible outcomes of the
        //integer from 0-6 (the first 7 numbers) to match with the 7 days of the week for the Enum indexes
        var allDays = DayOfTheWeek.values(); //.values is Enum method that returns an array of all Enum constant values
        // 'allDays' is effectively set to an array 'allDays[]' where 'SUN' is set to index 0, etc.

        return allDays[randomInteger]; //uses random integer generator to call element of a random index
    }
}