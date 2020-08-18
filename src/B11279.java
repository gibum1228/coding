import java.util.Scanner;
import java.util.ArrayList;

public class B11279 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // case
		ArrayList<Integer> maxHeap = new ArrayList<>(); // �ִ���
		maxHeap.add(0); // 1���� �����ϱ� ���� �ε��� 0���� 0���� �ʱ�ȭ
		
		for(int i = 0; i < n; i++) {
			int op = sc.nextInt(); // ����
			
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

	// ����Ʈ �ϱ� ���� �޼ҵ�
	static void heapPrint(ArrayList<Integer> h) {
		
		System.out.println(h.get(1)); // ���
		h.set(1, h.get(h.size() - 1)); // ������ ���� root�� �̵�
		h.remove(h.size() - 1); // ������ ���� ����
		
		topSort(h, 1);
	}
	// heap�� ������ ����
	static void topSort(ArrayList<Integer> h, int i) {
		int index = i;
		int leftC = index * 2;
		int rightC = index * 2 + 1;
		
		if(rightC <= h.size() - 1) { // ������ �ڽ��� �ִ� ���
			
			if(h.get(leftC) > h.get(rightC)){ // ������ �����ʺ��� ũ��
				
				if(h.get(leftC) > h.get(index)) { // ������ ������ Ŭ ���
					int tmp = h.get(index); // ����
					h.set(index, h.get(leftC));
					h.set(leftC, tmp);
					
					topSort(h, leftC); // �� ���� ���� ������ ���
				}
			}else { // �������� ���ʺ��� ũ��
				
				if(h.get(rightC) > h.get(index)) { // ���������� ������ Ŭ ���
					int tmp = h.get(index); // ����
					h.set(index, h.get(rightC));
					h.set(rightC, tmp);
					
					topSort(h, rightC); // �� ���� ���� ������ ���
				}
			}
		}else if(leftC <= h.size() - 1) {
			
			if(h.get(leftC) > h.get(index)) { // ������ ������ Ŭ ���
				int tmp = h.get(index); // ����
				h.set(index, h.get(leftC));
				h.set(leftC, tmp);
				
				topSort(h, leftC); // �� ���� ���� ������ ���
			}
		}else {
			// END
		}
		
	}
	// heap�� �Ʒ����� ����
	static void underSort(ArrayList<Integer> h) {
		int focusingIndex = h.size() - 1;
		
		while(true) {
			if(focusingIndex == 1) { // ��Ʈ ����� ��� break;
				break;
			}

			int p = h.get(focusingIndex / 2);
			int c = h.get(focusingIndex);
			
			if(c < p) {
				break; // �ڽ��� �θ𺸴� ������ break;
			}else {
				h.set(focusingIndex / 2, c);
				h.set(focusingIndex, p);
				
				focusingIndex /= 2;
			}
		}
	}
}
