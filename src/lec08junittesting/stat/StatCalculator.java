package lec08junittesting.stat;


public class StatCalculator {

    public int average(int[] data) {
        int sum = 0;
        for (int d : data) {
            sum += d;
        }
        if (data.length == 0)
            return 0;
        return sum/data.length;
    }
}
