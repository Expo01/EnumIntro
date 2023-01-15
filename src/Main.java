import java.util.Random;

public class Main {
    public static void main(String[] args) {

        DayOfTheWeek weekDay = DayOfTheWeek.TUES;
        System.out.println(weekDay);

        for (int i = 0; i < 10; i++ ) {
            weekDay = getRandomDay();

            System.out.printf("Name is %s, Ordinal Value = %d%n",
                    weekDay.name(), weekDay.ordinal()); // .name will print the enum value such as TUES while the
            //ordinal will print the equivalnt of the Enum index, in this case '2'

            if (weekDay == DayOfTheWeek.FRI) {
                System.out.println("Found a Friday!!!");
            }

        }
    }

    public static DayOfTheWeek getRandomDay() {

        int randomInteger = new Random().nextInt(7); //random integer created and limited thee possible outcomes of the
        //integeer from 0-6 (the first 7 numbers) to match with the 7 days of the week for the Enum indexes
        var allDays = DayOfTheWeek.values(); //.values is Enum method that returns an array of all Enum constant values
        // 'allDays' is effectively set to an array 'allDays[]' but java not hinting at type as it should be

        return allDays[randomInteger];
    }
}