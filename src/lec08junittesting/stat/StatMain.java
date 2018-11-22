package lec08junittesting.stat;

public class StatMain {
    public static void main(String[] args) {

        int[] data1 = { 70, 5, 40 };
        int[] data2 = { 1000, 10, 700 };
        int[] data3 = { };
        int[] data4 = { 5 };
        int[] data5 = { 1,2,3,4,5,6 };
        int[] data6 = { -4, -8 };

        StatCalculator cal = new StatCalculator();
        int avg1 = cal.average(data1);
        int avg2 = cal.average(data2);
        int avg3 = cal.average(data3);
        int avg4 = cal.average(data4);
        int avg5 = cal.average(data5);
        int avg6 = cal.average(data6);

        System.out.println("data1 average should be 38: " + avg1);
        System.out.println("data2 average should be 570: " + avg2);
        System.out.println("data3 average should be 0: " + avg3);
        System.out.println("data4 average should be 5: " + avg4);
        System.out.println("data5 average should be 3: " + avg5);
        System.out.println("data6 average should be -6: " + avg6);
    }
}
