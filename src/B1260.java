import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B1260 { // ���� �迭�� �̿��� �׷����� BFS, DFS
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // ������ ����
		int m = sc.nextInt(); // ������ ����
		int v = sc.nextInt(); // ���� ����
		Graph graph = new Graph(n);
		
		for(int i = 0; i < m; i++) { // ���� �߰�
			int s = sc.nextInt();
			int e = sc.nextInt();
			
			graph.addVertex(s, e);
		}
		
		graph.setVertex(); // ���� ����
		// DFS
		graph.setVisited();
		graph.DFS(v);
		System.out.println(graph.getDFS());
		// BFS
		graph.setVisited();
		graph.BFS(v);
		System.out.println(graph.getBFS());
		
		sc.close();
	}
}

class Graph {
	private Node[] list; // ���� �迭 �׷���
	private String resultBFS = ""; // �ʺ� �켱 Ž�� ���
	private String resultDFS = ""; // ���� �켱 Ž�� ���
	private boolean[] visited; // �湮 ���
	
	// ������
	public Graph() {};
	public Graph(int n) {
		this.list = new Node [n+1]; // �迭 ũ�� ����
		this.visited = new boolean[n+1]; // �湮 ��� ũ�� ����
		
		for(int i = 1; i < n+1; i++) { // �ν��Ͻ�ȭ
			list[i] = new Node();
		}
	}
	
	// ���� �߰�
	void addVertex(int s, int e) {
		list[s].nexts.add(e);
		list[e].nexts.add(s);
	}
	// �ʺ� �켱 Ž��
	void BFS(int startV) {
		Queue<Integer> q = new LinkedList<>();
		q.add(startV);
		visited[startV] = true;
		
		while(!q.isEmpty()) {
			startV = q.poll();
			resultBFS += startV + " ";
			
			for(int i: list[startV].nexts) {
				if(!visited[i]) {
					q.add(i);
					visited[i] = true;
				}
			}
		}
	}
	// ���� �켱 Ž��
	void DFS(int startV) {
		visited[startV] = true;
		resultDFS += startV + " ";
		
		for(int i: list[startV].nexts) {
			if(visited[i] == false) {
				DFS(i);
			}
		}
	}
	// setter
	// �湮 ��� �ʱ�ȭ
	void setVisited() {
		for(int i = 1; i < visited.length; i++) { // �湮 ��� �ʱ�ȭ
			visited[i] = false;
		}
	}
	// ���� ������ ���� ��ȣ�� �鸮�� ���� ����
	void setVertex() {
		for(int i = 1; i < list.length; i++) {
			if(!list[i].nexts.isEmpty()) {
				Collections.sort(list[i].nexts);
			}
		}
	}
	// getter
	String getBFS() {
		return this.resultBFS;
	}
	String getDFS() {
		return this.resultDFS;
	}
	
	class Node {
		ArrayList<Integer> nexts;
		
		public Node() {
			this.nexts = new ArrayList<Integer>(); // �ν��Ͻ�ȭ
		}
	}
}
