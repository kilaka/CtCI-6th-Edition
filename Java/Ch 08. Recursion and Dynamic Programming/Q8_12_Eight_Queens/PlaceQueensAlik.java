package Q8_12_Eight_Queens;

import java.util.ArrayList;
import java.util.stream.IntStream;

import static Q8_12_Eight_Queens.Question.GRID_SIZE;
import static Q8_12_Eight_Queens.Question.clear;

public class PlaceQueensAlik {
	int[] queens = new int[GRID_SIZE];
	int[] columns = new int[GRID_SIZE];
	int[] leftDiagonals = new int[GRID_SIZE * 2 + 1];
	int[] rightDiagonals = new int[GRID_SIZE * 2 + 1];
	ArrayList<int[]> boards = new ArrayList<>();

	public static void main(String[] args) {
		new PlaceQueensAlik().placeQueens();
	}

	public void placeQueens() {
		clear(queens);
		placeQueens(0);
//		printBoards(boards);
//		System.out.println(boards.size());
	}

	private void placeQueens(int row) {
		if (row == GRID_SIZE) {
			boards.add(queens.clone());
			return;
		}
		IntStream.range(0, GRID_SIZE).forEach(column -> {
			if (columns[column] != 0) return;
			int leftDiagonal = column - row + GRID_SIZE;
			if (leftDiagonals[leftDiagonal] != 0) return;
			int rightDiagonal = (GRID_SIZE - 1) * 2 - row - column;
			if (rightDiagonals[rightDiagonal] != 0) return;
			queens[row] = column;
			columns[column] = 1;
			leftDiagonals[leftDiagonal] = 1;
			rightDiagonals[rightDiagonal] = 1;
			placeQueens(row + 1);
			queens[row] = -1;
			columns[column] = 0;
			leftDiagonals[leftDiagonal] = 0;
			rightDiagonals[rightDiagonal] = 0;
		});
	}
}
