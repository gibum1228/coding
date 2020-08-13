import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B1260 { // 인접 배열을 이용한 그래프의 BFS, DFS
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 정점의 갯수
		int m = sc.nextInt(); // 간선의 갯수
		int v = sc.nextInt(); // 시작 정점
		Graph graph = new Graph(n);
		
		for(int i = 0; i < m; i++) { // 간선 추가
			int s = sc.nextInt();
			int e = sc.nextInt();
			
			graph.addVertex(s, e);
		}
		
		graph.setVertex(); // 간선 정렬
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
	private Node[] list; // 인접 배열 그래프
	private String resultBFS = ""; // 너비 우선 탐색 결과
	private String resultDFS = ""; // 깊이 우선 탐색 결과
	private boolean[] visited; // 방문 기록
	
	// 생성자
	public Graph() {};
	public Graph(int n) {
		this.list = new Node [n+1]; // 배열 크기 지정
		this.visited = new boolean[n+1]; // 방문 기록 크기 지정
		
		for(int i = 1; i < n+1; i++) { // 인스턴스화
			list[i] = new Node();
		}
	}
	
	// 간선 추가
	void addVertex(int s, int e) {
		list[s].nexts.add(e);
		list[e].nexts.add(s);
	}
	// 너비 우선 탐색
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
	// 깊이 우선 탐색
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
	// 방문 기록 초기화
	void setVisited() {
		for(int i = 1; i < visited.length; i++) { // 방문 기록 초기화
			visited[i] = false;
		}
	}
	// 낮은 순으로 정점 번호를 들리기 위해 정렬
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
			this.nexts = new ArrayList<Integer>(); // 인스턴스화
		}
	}
}
