package lec08junittesting.practice;

public class MathUtil {

    public int power(int left, int right) {
        // Raises left to the power of right
        // Return -1 if right < 0
        // Ex: power(3,2) = 9
        int result = 1;
        if (right < 0)
            return -1;
        for (int i = 1; i <= right; i++)
            result = result * left;
        return result;
    }
}
