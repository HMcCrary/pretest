package prob1;

public class Prob1 {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		int[] numbers = {4, 7, 2, 9, 1};

	}
	public static int findMaxDifference(int[] numbers) {
		int max = 0;
		int min = 0;
		
		if (numbers.length < 2) {
			return 0;
		} else {
			for(int i = 0; i < numbers.length; i++) {
				if (numbers[i] > i) {
					 numbers[i] = max;
				}
			}
		}
	}

}
