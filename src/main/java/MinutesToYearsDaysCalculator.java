public class MinutesToYearsDaysCalculator {
    private static String TIME_CONTEXT_SETTINGS = "%03d year :%03d days :%03d h :%03d m";


    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hour = minutes / 60;
            long remainingMINUTES = minutes % 60;
            long day = hour / 24;
            long remainingHOURS = hour % 24;
            long remainingDAYS = day % 365;
            long year = day / 365;

            System.out.println(minutes + " min = " + String.format
                    (TIME_CONTEXT_SETTINGS, year, remainingDAYS, remainingHOURS, remainingMINUTES));
        }
    }

    /*  Wersja która przeszła

        private static String TIME_CONTEXT_SETTINGS = " min = %01d y and %01d d";


        public static void printYearsAndDays(long minutes) {
            if (minutes < 0) {
                System.out.println("Invalid Value");
            } else {
                long hour = minutes / 60;
                long remainingMINUTES = minutes % 60;
                long day = hour / 24;
                long remainingHOURS = hour % 24;
                long remainingDAYS = day % 365;
                long year = day / 365;

                System.out.println(minutes + String.format
                        (TIME_CONTEXT_SETTINGS, year, remainingDAYS));
            }
        }
    * */

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(-525600);
        printYearsAndDays(1051200);
    }
}
