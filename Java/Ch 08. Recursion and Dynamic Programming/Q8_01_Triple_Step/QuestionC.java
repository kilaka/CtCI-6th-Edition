package Q8_01_Triple_Step;

import java.util.LinkedList;
import java.util.Queue;

public class QuestionC {

	public static int countWays(int n) {
		if (n == 0 || n == 1) return 1;
		if (n == 2) return 2;
		if (n == 3) return 4;
		Queue<Integer> lastNums = new LinkedList<>();
		lastNums.add(1);
		lastNums.add(2);
		lastNums.add(4);
		int nextNum = 0;
		for (int i = 3; i < n; ++i) {
			nextNum = 0;
			for (int lastNum : lastNums) {
				nextNum += lastNum;
			}
			lastNums.remove();
			lastNums.add(nextNum);
		}
		return nextNum;
	}
}
