package Q8_06_Towers_of_Hanoi;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.IntStream;

public class QuestionAlik {

	private static Stack<Integer> from;
	private static Stack<Integer> to;
	private static Stack<Integer> temp;

	public static void solveHanoi(Stack<Integer> from, Stack<Integer> to, Stack<Integer> temp) {
		solveHanoi(from.size(), from, to, temp);
	}

	public static void solveHanoi(int fromSize, Stack<Integer> from, Stack<Integer> to, Stack<Integer> temp) {
		if (fromSize == 1) {
			to.push(from.pop());
			print();
			return;
		}
		solveHanoi(fromSize - 1, from, temp, to);
		to.push(from.pop());
		print();
		solveHanoi(fromSize - 1, temp, to, from);
	}

	private static void print() {
		System.out.println();
		System.out.println(Arrays.toString(from.toArray()));
		System.out.println(Arrays.toString(temp.toArray()));
		System.out.println(Arrays.toString(to.toArray()));
	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		from = new Stack<>();
		int range = 18;
		revRange(1, range+1).forEach(from::push);
//		IntStream.of(10,9,8,7,6,5,4,3,2,1).forEach(from::push);
		to = new Stack<>();
		temp = new Stack<>();
		print();
		solveHanoi(from, to, temp);
		print();
		System.out.println();
		System.out.println("Seconds run:" + (System.currentTimeMillis() - startTime)/1000);
	}

	static IntStream revRange(int from, int to) {
		return IntStream.range(from, to).map(i -> to - i + from - 1);
	}

}
