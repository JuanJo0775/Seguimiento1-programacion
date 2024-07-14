package IntExamples;

public class Average {
    int[] numbers;
    private double average;

    Average(int[] numbers) {
        this.numbers = numbers;
        this.average = calculateAverage(numbers);
    }

    double calculateAverage(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return (double) sum / nums.length;
    }

     double getAverage() {
        return average;
    }
}
