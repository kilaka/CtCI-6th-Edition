package Q8_02_Robot_in_a_Grid;

import CtCILibrary.AssortedMethods;

import java.util.ArrayList;
import java.util.List;

public class QuestionCAlik {
	public static List<Point> getPath(boolean[][] maze) {
		return getPath(maze, 0, 0);
	}

	public static List<Point> getPath(boolean[][] maze, int i, int j) {
		if (i >= maze.length || j >= maze[i].length || !maze[i][j]) {
			return null;
		}
		Point currentItem = new Point(i, j);
		if (i == maze.length - 1 && j == maze[i].length - 1) {
			List<Point> subPath = new ArrayList<>();
			subPath.add(currentItem);
			return subPath;
		}
		List<Point> subPath = getPath(maze, i, j + 1);
		if (subPath == null) {
			subPath = getPath(maze, i + 1, j);
		}
		if (subPath == null) return null;
		subPath.add(0, currentItem);
		return subPath;
	}

	public static void main(String[] args) {
		int size = 20;
		boolean[][] maze = AssortedMethods.randomBooleanMatrix(size, size, 60);

		AssortedMethods.printMatrix(maze);

		List<Point> path = getPath(maze);
		if (path != null) {
			System.out.println(path.toString());
		} else {
			System.out.println("No path found.");
		}
	}

}
