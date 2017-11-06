package Q4_08_First_Common_Ancestor;

import CtCILibrary.TreeNode;

public class QuestionEAlik {

	public static class Res {
		boolean n1Found;
		boolean n2Found;
		TreeNode common;

	}

	public static Res firstCommonAncestor(TreeNode n, TreeNode n1, TreeNode n2) {
		if (n ==null) return new Res();
		Res res = new Res();
		res.n1Found = n == n1;
		res.n2Found = n == n2;
		if (!res.n1Found || !res.n2Found) {
			Res resChild = firstCommonAncestor(n.left, n1, n2);
			if (resChild.common != null) {
				return resChild;
			}
			res.n1Found |= resChild.n1Found;
			res.n2Found |= resChild.n2Found;
		}
		if (!res.n1Found || !res.n2Found) {
			Res resChild = firstCommonAncestor(n.right, n1, n2);
			if (resChild.common != null) {
				return resChild;
			}
			res.n1Found |= resChild.n1Found;
			res.n2Found |= resChild.n2Found;
		}
		if (res.n1Found && res.n2Found) {
			res.common = n;
		}
		return res;
	}

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		TreeNode root = TreeNode.createMinimalBST(array);
		TreeNode n3 = root.find(10);
		TreeNode n7 = root.find(6);
		TreeNode ancestor = firstCommonAncestor(root, n3, n7).common;
		if (ancestor != null) {
			System.out.println(ancestor.data);
		} else {
			System.out.println("null");
		}
	}

}
