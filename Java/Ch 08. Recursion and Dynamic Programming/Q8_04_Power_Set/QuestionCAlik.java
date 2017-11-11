package Q8_04_Power_Set;

import java.util.ArrayList;

public class QuestionCAlik {
	
	public static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set) {
		ArrayList<ArrayList<Integer>> allSubsets = new ArrayList<>();
		allSubsets.add(new ArrayList<>()); // Empty set
		for (int num : set) {
			int size = allSubsets.size();
			for (int i = 0 ; i < size ; ++i) {
				ArrayList<Integer> subset = allSubsets.get(i);
				ArrayList<Integer> newSubset = new ArrayList<>(subset);
				newSubset.add(num);
				allSubsets.add(newSubset);
			}
		}
		return allSubsets;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) {
			list.add(i);
		}
		
		ArrayList<ArrayList<Integer>> subsets2 = getSubsets(list);
		System.out.println(subsets2.toString());		
	}

}
