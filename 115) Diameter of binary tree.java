/*************************************************************

Following is the Binary Tree Node structure:

    class TreeNode<T> {
		public T data;
		public BinaryTreeNode<T> left;
		public BinaryTreeNode<T> right;

		TreeNode(T data) {
			this.data = data;
			left = null;
			right = null;
	  	}
    }

*************************************************************/

public class Solution {
	static int findDiameter(TreeNode<Integer> root, int[] max){
		if(root == null) return 0;

		int left = findDiameter(root.left, max);
		int right = findDiameter(root.right, max);
		max[0] = Math.max(max[0], left + right);
		return 1 + Math.max(left, right);
	}
	public static int diameterOfBinaryTree(TreeNode<Integer> root) {
		int[] max = new int[]{-(int)1e9};
		findDiameter(root, max);
		return max[0];
	}
}