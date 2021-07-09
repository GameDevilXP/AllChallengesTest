public class NumberOfDaysInMonth {

    // Not needed, but its just for testing

    public static final int THIRTY_ONE = 31;
    public static final int THIRTY = 30;
    private static final int DEFAULT_ERROR = -1;

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 3));
    }

    public static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999) {
            return false;
        }

        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        if((month > 12 || month < 1 )|| (year < 1 || year > 9999)) {
            return -1;
        }

        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return THIRTY_ONE;
            case 2:
                if(isLeapYear(year)) return 29;
                else return 28;
            case 4: case 6: case 9: case 11:
                return THIRTY;
            default:
                return DEFAULT_ERROR;
        }
    }
}
