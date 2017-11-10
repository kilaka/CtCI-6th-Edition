package Q8_01_Triple_Step;

import java.text.MessageFormat;

public class Tester {
	
	public static void main(String[] args) {
		for (int i = 0; i < 30; i++) {
			long start1 = System.currentTimeMillis();
			int c1 = QuestionA.countWays(i);
			long start2 = System.currentTimeMillis();
			int c2 = QuestionB.countWays(i);
			long start3 = System.currentTimeMillis();
			int c3 = QuestionC.countWays(i);
			long end3 = System.currentTimeMillis();
			System.out.println(MessageFormat.format("{0}: {1}({2}), {3}({4}), {5}({6})",i, c1, start2-start1, c2, start3-start2, c3, end3-start3));
		}
	}

}
