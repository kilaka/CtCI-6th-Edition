package Q16_08_English_Int;

import java.util.HashMap;

public class EnglishIntAlik {
//	Partial implementation
	private static final HashMap<Integer, String> names = new HashMap<>();
	static {
		names.put(1, "One");
		names.put(2, "Two");
		names.put(20, "Twenty");
	}
	private static final HashMap<Integer, String> levels = new HashMap<>();
	static {
		levels.put(1, "Thousand");
	}

	public static void main(String[] args) {
		printPhrase(1202);
	}

	private static void printPhrase(int num) {
		if (num == 0) System.out.println("Zero");
		printSubPhrase(num, 0);
	}

	private static void printSubPhrase(int num, int level) {
		if (num == 0) return;
		int nextSubNum = num / 1000;
		printSubPhrase(nextSubNum, level + 1);
		int subNum = num - nextSubNum * 1000;
		int hundred = subNum / 100;
		if (hundred != 0) {
			System.out.print(" " + names.get(hundred) + " Hundred");
		}
		int decimal = subNum - hundred * 100;
		if (decimal == 0) return;
		if (decimal < 20) {
			System.out.print(" " + names.get(decimal));
		} else {
			int tens = (decimal / 10) * 10;
			if (tens != 0) System.out.print(" " + names.get(tens));
			int single = decimal - tens;
			if (single != 0) System.out.print(" " + names.get(single));
		}
		if (level != 0) System.out.print(" " + levels.get(level));
	}

}
