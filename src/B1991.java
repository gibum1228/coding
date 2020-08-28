import java.util.Scanner;

public class B1991 { 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// init_
		int testCase = sc.nextInt();
		Node tree = new Node("A");
		
		// create tree
		for(int i = 0; i < testCase; i++) {

			String key = sc.next();
			String left = sc.next();
			String right = sc.next();
			
			if(i == 0) {
				tree.addChild(left, right); // root
			}else {
				findNode(tree, key, left, right); // tree
			}
		}
		
		// ��ȸ ��� 
		preOrder(tree);
		System.out.println();
		inOrder(tree);
		System.out.println();
		postOrder(tree);
		
		sc.close();
	}

	// Key ã�� - ���� ��ȸ ����� ���� ��带 ã��
	static void findNode(Node t, String k, String l, String r) {
		if(t.key.compareTo(k) == 0) { // ���� ��尡 key�� ���
			t.addChild(l, r); // �ڽ� �߰�
		}
		if(t.left != null) { // ���� �ڽ��� ���� ���
			findNode(t.left, k, l, r);
		}
		if(t.right != null) { // ������ �ڽ��� ���� ���
			findNode(t.right, k, l, r);
		}
	}
	// ���� ��ȸ
	static void preOrder(Node tree) {
		
		System.out.print(tree.key);
		if(tree.left != null) {
			preOrder(tree.left);
		}
		if(tree.right != null) {
			preOrder(tree.right);
		}
	}
	// ���� ��ȸ
	static void inOrder(Node tree) {
		
		if(tree.left != null) {
			inOrder(tree.left);
		}
		System.out.print(tree.key);
		if(tree.right != null) {
			inOrder(tree.right);
		}
	}
	// ���� ��ȸ
	static void postOrder(Node tree) {

		if(tree.left != null) {
			postOrder(tree.left);
		}
		if(tree.right != null) {
			postOrder(tree.right);
		}
		System.out.print(tree.key);
	}
}
// node Ŭ����
class Node {
	String key;
	Node left = null;
	Node right = null;
	
	// init_
	public Node() {}
	public Node(String key) {
		this.key = key;
	}
	
	// method
	void addChild(String left, String right) {
		if(left.compareTo(".") != 0) {
			this.left = new Node(left);
		}
		if(right.compareTo(".") != 0) {
			this.right = new Node(right);
		}
	}
}