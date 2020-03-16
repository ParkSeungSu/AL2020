package com.hallaAL;

/*
 * (1) 현재 노드를 방문하여 데이터를 읽는 작업 D
 * (2) 현재 노드의 왼쪽 서브트리로 이동하는 작업 L
 * (3) 현재 노드의 오른쪽 서브트리로 이동하는 작업 R
 * 
 * 서브트리를 순회는 순서는 항상 왼쪽 서브트리를 먼저 방문하고
 * 그 후에 오른쪽 서브트리를 방문한다.
 * 노드를 방문하는 순성 따라 전위 순회, 중위 순회, 후위 순회로 나눌 수 있다.
 * 
 * 
 */





//트리 노드 클래스
class TreeNode {
	Object data;
	TreeNode left;
	TreeNode right;

	public TreeNode(Object data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public Object getData() {
		return this.data;
	}
}

// 이진 트리 클래스
class LinkedTree {
	private TreeNode root;

	public TreeNode makeBT(TreeNode left, Object data, TreeNode rigth) {
		TreeNode root = new TreeNode(data);
		root.left = left;
		root.right = rigth;
		return root;
	}

	// 전위순회
	/*
	 *루트 노드를 방문한다.=D
	 *왼쪽 서브트리를 전위 순회한다.=L
	 *오른쪽 서브트리를 전위 순회한다.=R
	 * 
	 * DLR 순서
	 * 
	 */
	
	public void preorder(TreeNode root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preorder(root.left);
			preorder(root.right);
		}
	}

	// 중위 순회
	/*
	 *왼쪽 서브트리를 전위 순회한다.=L
	 *루트 노드를 방문한다.=D
	 *오른쪽 서브트리를 전위 순회한다.=R
	 * 
	 * LDR 순서
	 * 
	 */
	
	public void inorder(TreeNode root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}

	// 후위 순회
	/*
	 *왼쪽 서브트리를 전위 순회한다.=L
	 *오른쪽 서브트리를 전위 순회한다.=R
	 *루트 노드를 방문한다.=D
	 * 
	 * LRD 순서
	 * 
	 */
	
	public void postorder(TreeNode root) {
		if (root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data + " ");
		}
	}

}

public class BinaryTree {

	public static void main(String[] args) {
		LinkedTree tree = new LinkedTree();
        TreeNode n6 = tree.makeBT(null, 'F', null);
        TreeNode n5 = tree.makeBT(null, 'E', null);
        TreeNode n4 = tree.makeBT(null, 'D', null);
        TreeNode n3 = tree.makeBT(n6, 'C', null);
        TreeNode n2 = tree.makeBT(n4, 'B', n5);
        TreeNode n1 = tree.makeBT(n2, 'A', n3);
        
        System.out.print("\n전위 순회 : ");
        tree.preorder(n1);
        
        System.out.print("\n중위 순회 : ");
        tree.inorder(n1);
        
        System.out.print("\n후위 순회 : ");
        tree.postorder(n1);

	}

}
