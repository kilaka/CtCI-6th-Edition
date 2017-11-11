package Q8_02_Robot_in_a_Grid;

import java.util.ArrayList;
import java.util.List;

import CtCILibrary.AssortedMethods;

public class Tester {
	public static void main(String[] args) {
		int size = 20;
		boolean[][] maze = AssortedMethods.randomBooleanMatrix(size, size, 70);
		
		AssortedMethods.printMatrix(maze);
		
		ArrayList<Point> pathA = QuestionA.getPath(maze);
		ArrayList<Point> pathB = QuestionB.getPath(maze);
		List<Point> pathC = QuestionCAlik.getPath(maze);
		if (pathA != null) {
			System.out.println(pathA.toString());
		} else {
			System.out.println("No path found.");
		}
		
		if (pathB != null) {
			System.out.println(pathB.toString());
		} else {
			System.out.println("No path found.");
		}

		if (pathC != null) {
			System.out.println(pathC.toString());
		} else {
			System.out.println("No path found.");
		}
	}
}
