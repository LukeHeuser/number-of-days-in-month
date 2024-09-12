public class NumberOfDaysInMonth {
    public static void main(String[] args) {

        isLeapYear(100);
        isLeapYear(50);
        isLeapYear(6800);

        getDaysInMonth(8,2000);
        getDaysInMonth(2,2016);
        getDaysInMonth(2,2150);

    }

    public static boolean isLeapYear(int year){

        if (year < 1 || year > 9999){
            System.out.println("Not a valid year. Must be between 1 & 9999");
            return false;
        } else if (year % 4 == 0 && year % 100 != 0 || year % 100 == 0 && year % 400 == 0){
            System.out.println("The year " + year + " is a leap year!");
            return true;
        }
        System.out.println("The year " + year + " is not a leap year!");
        return false;
    }

    public static int getDaysInMonth(int month, int year){

        if (year < 1 || year > 9999){
            System.out.println("Not a valid year!");
            return -1;
        }

        int daysInMonth = 0;

        switch (month){
            case 1 -> daysInMonth = 31;
            case 2 -> {
                daysInMonth = isLeapYear(year) ? 29 : 28;
            }
            case 3 -> daysInMonth = 31;
            case 4 -> daysInMonth = 30;
            case 5 -> daysInMonth = 31;
            case 6 -> daysInMonth = 30;
            case 7 -> daysInMonth = 31;
            case 8 -> daysInMonth = 31;
            case 9 -> daysInMonth = 30;
            case 10 -> daysInMonth = 31;
            case 11 -> daysInMonth = 30;
            case 12 -> daysInMonth = 31;
            default -> daysInMonth = -1;
        };
        System.out.println("There are " + daysInMonth + " days in month " + month + " in the year " + year);
        return daysInMonth;
    }
}
