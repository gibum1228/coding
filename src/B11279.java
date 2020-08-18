import java.util.Scanner;
import java.util.ArrayList;

public class B11279 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // case
		ArrayList<Integer> maxHeap = new ArrayList<>(); // 최대힙
		maxHeap.add(0); // 1부터 시작하기 위해 인덱스 0번을 0으로 초기화
		
		for(int i = 0; i < n; i++) {
			int op = sc.nextInt(); // 연산
			
			if(op == 0) {
				if(maxHeap.size() == 1) {
					System.out.println("0");
				}else {
					heapPrint(maxHeap);
				}
			}else {
				maxHeap.add(op);
				underSort(maxHeap);
			}
		}
		
		sc.close();
	}

	// 프린트 하기 위한 메소드
	static void heapPrint(ArrayList<Integer> h) {
		
		System.out.println(h.get(1)); // 출력
		h.set(1, h.get(h.size() - 1)); // 마지막 원소 root로 이동
		h.remove(h.size() - 1); // 마지막 원소 삭제
		
		topSort(h, 1);
	}
	// heap을 위부터 정렬
	static void topSort(ArrayList<Integer> h, int i) {
		int index = i;
		int leftC = index * 2;
		int rightC = index * 2 + 1;
		
		if(rightC <= h.size() - 1) { // 오른쪽 자식이 있는 경우
			
			if(h.get(leftC) > h.get(rightC)){ // 왼쪽이 오른쪽보다 크고
				
				if(h.get(leftC) > h.get(index)) { // 왼쪽이 나봐다 클 경우
					int tmp = h.get(index); // 스왑
					h.set(index, h.get(leftC));
					h.set(leftC, tmp);
					
					topSort(h, leftC); // 힙 조건 맞출 때까지 재귀
				}
			}else { // 오른쪽이 왼쪽보다 크고
				
				if(h.get(rightC) > h.get(index)) { // 오른쪽이이 나봐다 클 경우
					int tmp = h.get(index); // 스왑
					h.set(index, h.get(rightC));
					h.set(rightC, tmp);
					
					topSort(h, rightC); // 힙 조건 맞출 때까지 재귀
				}
			}
		}else if(leftC <= h.size() - 1) {
			
			if(h.get(leftC) > h.get(index)) { // 왼쪽이 나봐다 클 경우
				int tmp = h.get(index); // 스왑
				h.set(index, h.get(leftC));
				h.set(leftC, tmp);
				
				topSort(h, leftC); // 힙 조건 맞출 때까지 재귀
			}
		}else {
			// END
		}
		
	}
	// heap을 아래부터 정렬
	static void underSort(ArrayList<Integer> h) {
		int focusingIndex = h.size() - 1;
		
		while(true) {
			if(focusingIndex == 1) { // 루트 노드일 경우 break;
				break;
			}

			int p = h.get(focusingIndex / 2);
			int c = h.get(focusingIndex);
			
			if(c < p) {
				break; // 자식이 부모보다 작으면 break;
			}else {
				h.set(focusingIndex / 2, c);
				h.set(focusingIndex, p);
				
				focusingIndex /= 2;
			}
		}
	}
}
