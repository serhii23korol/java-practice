package arrays;

// Min, max, sum and average of an array without using library methods
public class ArrayStatistics {

	public static void main(String[] args) {
		int[] numbers = {2, 8, 40, 10};

		int max = max(numbers);
		int min = min(numbers);
		int sum = sum(numbers);
		double avg = (double) sum / numbers.length;

		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + avg);
	}

	private static int max(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	private static int min(int[] array) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	private static int sum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
}
