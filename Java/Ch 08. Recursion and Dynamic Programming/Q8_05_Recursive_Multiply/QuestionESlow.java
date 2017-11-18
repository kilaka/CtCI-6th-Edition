package Q8_05_Recursive_Multiply;

public class QuestionESlow {
	public static int counter = 0;
	
	public static int minProduct(int a, int b) {
		counter++;
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		if (min == 0) return 0;
		if (min == 1) return max;
		return (max<<1) + minProduct(max, min-2);
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				int prod1 = minProduct(i, j);
				int prod2 = i * j;
				if (prod1 != prod2) {
					System.out.println("ERROR: " + i + " * " + j + " = " + prod2 + ", not " + prod1);
				}
			}
		}
	}

}
