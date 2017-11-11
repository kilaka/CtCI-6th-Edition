package Q8_02_Robot_in_a_Grid;

import CtCILibrary.AssortedMethods;

import java.util.ArrayList;
import java.util.List;

// Not working :(
public class QuestionDAlik {
	public static List<Point> getPath(boolean[][] maze) {
		if (maze.length==0 || maze[0].length == 0 || !maze[0][0]) {
			return null;
		}
		List<Point> path = new ArrayList<>();
		int i = 0, j = 0;
		//boolean columnProgress = true;
		while (i < maze.length) {
			if (j < maze[i].length && maze[i][j]) {
				path.add(new Point(i, j));
				++j;
			} else {
				if (path.isEmpty()) return null;
				boolean columnProgress = i == path.get(path.size() - 1).row;
				if (columnProgress) {
					++i;
					--j;
				} else {
					path.remove(path.size() - 1);
					if (path.isEmpty()) return null;
					Point last = path.get(path.size() - 1);
					i = last.row + 1;
					j = last.column;
				}
			}
		}
		Point last = path.get(path.size() - 1);
		return last.row == maze.length - 1 && last.column == maze[maze.length - 1].length - 1 ? path : null;
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
