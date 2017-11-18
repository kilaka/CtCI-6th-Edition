package Q8_05_Recursive_Multiply;

public class QuestionCNonRecursive {

	public static int counter = 0;

	public static int minProductHelper(int smaller, int bigger) {
		if (smaller == 0) return 0;
		int product = bigger;
		int reminder = 0;
		while (smaller > 1) {
			if (smaller % 2 == 1) {
				reminder += product;
				smaller--;
			}
			counter++;
			product <<= 1;
			smaller >>= 1;
		}
		counter++;
		product += reminder;
		return product;
	}


	public static int minProduct(int a, int b) {
		int bigger = a < b ? b : a;
		int smaller = a < b ? a : b;

		return minProductHelper(smaller, bigger);
	}

	public static void main(String[] args) {
		int a = 13494;
		int b = 22323;
		int product = a * b;
		int minProduct = minProduct(a, b);
		if (product == minProduct) {
			System.out.println("Success: " + a + " * " + b + " = " + product);
		} else {
			System.out.println("Failure: " + a + " * " + b + " = " + product + " instead of " + minProduct);
		}
		System.out.println("Adds: " + counter);
	}

}
