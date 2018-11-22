package lec08junittesting.practice;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        if (year%4 == 0 || year%400 == 0)
            return true;
        return false;
    }
}
