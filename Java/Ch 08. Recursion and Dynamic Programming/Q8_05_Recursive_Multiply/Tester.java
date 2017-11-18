package Q8_05_Recursive_Multiply;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int max = 1000;
		int counterA = 0, counterB = 0, counterC = 0, counterD = 0, counterE = 0, counterCNonRecursive = 0;

		for (int a = 0; a < max; a++) {
			for (int b = 0; b < max; b++) {
				int prodA = QuestionA.minProduct(a, b);
				int prodB = QuestionB.minProduct(a, b);
				int prodC = QuestionC.minProduct(a, b);
				int prodCNonRecursive = QuestionCNonRecursive.minProduct(a, b);
				int prodD = QuestionD.minProduct(a, b);
				int prodE = 0; // disable
//				int prodE = QuestionEAlik.minProduct(a, b);

				int product = a * b;

				counterA += QuestionA.counter;
				counterB += QuestionB.counter;
				counterC += QuestionC.counter;
				counterCNonRecursive += QuestionCNonRecursive.counter;
				counterD += QuestionD.counter;
				counterE += QuestionESlow.counter;

				QuestionA.counter = 0;
				QuestionB.counter = 0;
				QuestionC.counter = 0;
				QuestionCNonRecursive.counter = 0;
				QuestionD.counter = 0;
				QuestionESlow.counter = 0;

				if (prodA != product || prodB != product || prodC != product || prodD != product || prodCNonRecursive != product) {
					System.out.println("Failure: " + a + " * " + b + " = " + product + " instead of (" + prodA + ", " + prodB + ", " + prodC + ", " + prodD + ", " + prodE + ", " + prodCNonRecursive + ")");
					break;
				}
			}
		}

		System.out.println();
		System.out.println("A: " + counterA);
		System.out.println("B: " + counterB);
		System.out.println("C: " + counterC);
		System.out.println("C: " + counterCNonRecursive + " (non recursive)");
		System.out.println("D: " + counterD);
		System.out.println("E: " + counterE);
	}

}
