import java.util.*;

public class B1966 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt(); // �׽�Ʈ ���̽�
		
		for(int i = 0; i < testCase; i++) {
			//init
			int dirSize = sc.nextInt(); // ������ ��
			int dirIndex = sc.nextInt(); // ã�� ������ ��ġ
			int count = 0; // ��µ� Ƚ��
			ArrayList<Document> q = new ArrayList<>(); // ���� ���� ����
			ArrayList<Integer> qSort = new ArrayList<>(); // ���� �߿䵵 ������ ����
			// ADD
			for(int j = 0; j < dirSize; j++) {
				
				int importance = sc.nextInt();
				
				q.add(new Document(j, importance));
				qSort.add(importance);
			}
			// SORT
			Collections.sort(qSort);
			// CALCUL
			while(true) {
				if(q.get(0).getImportance() >= qSort.get(qSort.size() - 1)) { // �߿䵵�� ���� ��
					if(q.get(0).getIndex() == dirIndex) { // ã�� �������
						count++;
						break; // ����
					}else { // �ƴ϶�� �׳� ���
						count++;
						
						q.remove(0);
						qSort.remove(qSort.size() - 1);
					}
				}else { // �߿䵵�� ���� ��
					Document tmp = q.get(0); // �� �ڷ� �̵�
					q.remove(0);
					q.add(tmp);
				}
			}
			// PRINT
			System.out.println(count);
		}
		
		sc.close();
	}
}

class Document {
	private int index; // ���� ��ġ
	private int importance; // ���� �߿䵵
	
	// __init__
	public Document(){}
	public Document(int index, int i) {
		this.index = index;
		this.importance = i;
	}
	// methods
	int getIndex() {
		return this.index;
	}
	int getImportance() {
		return this.importance;
	}
}