package lec09strategypattern.sort;

public class SortIntOnly {

    public static void main(String[] args) {
        int[] data = { 5, 2, 7, 4};
        sort(data);
        for (int i : data)
            System.out.println(i);
    }

    public static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {// i แบ่งส่วนเรียงแล้วกับยังไม่เรียง
            int minPos = i;
            for (int j = i + 1; j < a.length; j++) {  // วนลูปหาค่าน้อยสุด
                if (a[j] < a[minPos]) {
                    minPos = j;
                }
            }
            // สลับข้อมูลใน minPos และ i ทำให้ข้อมูลใน minPos ไปอยู่ส่วนที่เรียงแล้ว
            int temp = a[minPos];
            a[minPos] = a[i];
            a[i] = temp;
        }
    }

}
