public class Main {
    public static void main(String[] args) {

        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);


    }

    public static void printYearsAndDays(long minutes) {

        if (minutes <0) {
            System.out.println("Invalid value");
        }

        long years = minutes / 525600;
        long days = minutes % 525600 / 1440;

        System.out.println(minutes + " min/s = " + years + " y and " + days + " d");
    }
}