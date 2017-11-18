package Q8_06_Towers_of_Hanoi;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.IntStream;

public class QuestionAlik {

	private static Stack<Integer> source;
	private static Stack<Integer> target;
	private static Stack<Integer> help;

	private static int moves = 0;

	public static void solveHanoi(Stack<Integer> from, Stack<Integer> to, Stack<Integer> temp) {
		solveHanoi(from.size(), from, to, temp);
	}

	public static void solveHanoi(int fromSize, Stack<Integer> source, Stack<Integer> target, Stack<Integer> help) {
		if (fromSize == 1) {
			target.push(source.pop());
			moves++;
			print();
			return;
		}
		solveHanoi(fromSize - 1, source, help, target);
		target.push(source.pop());
		moves++;
		print();
		solveHanoi(fromSize - 1, help, target, source);
	}

	private static void print() {
		System.out.println();
		System.out.println(Arrays.toString(source.toArray()));
		System.out.println(Arrays.toString(help.toArray()));
		System.out.println(Arrays.toString(target.toArray()));
	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		source = new Stack<>();
		int disks = 1;
		revRange(1, disks+1).forEach(source::push);
//		IntStream.of(10,9,8,7,6,5,4,3,2,1).forEach(from::push);
		target = new Stack<>();
		help = new Stack<>();
		print();
		solveHanoi(source, target, help);
		print();
		System.out.println();
		System.out.println("Seconds run:" + (System.currentTimeMillis() - startTime)/1000);
		System.out.println("Moves: " + moves);
	}

	static IntStream revRange(int from, int to) {
		return IntStream.range(from, to).map(i -> to - i + from - 1);
	}

}
