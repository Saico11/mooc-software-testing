package tudelft.loops;

public class LoopExample {
    public static int sumEvenNumbers(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static int findFirstAboveLimit(int[] numbers, int limit) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > limit) {
                return numbers[i];
            }
        }
        return -1;
    }

}
