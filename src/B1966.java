import java.util.*;

public class B1966 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt(); // 테스트 케이스
		
		for(int i = 0; i < testCase; i++) {
			//init
			int dirSize = sc.nextInt(); // 문서의 수
			int dirIndex = sc.nextInt(); // 찾는 문서의 위치
			int count = 0; // 출력된 횟수
			ArrayList<Document> q = new ArrayList<>(); // 문서 정보 저장
			ArrayList<Integer> qSort = new ArrayList<>(); // 문서 중요도 순으로 정렬
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
				if(q.get(0).getImportance() >= qSort.get(qSort.size() - 1)) { // 중요도가 같을 시
					if(q.get(0).getIndex() == dirIndex) { // 찾는 문서라면
						count++;
						break; // 종료
					}else { // 아니라면 그냥 출력
						count++;
						
						q.remove(0);
						qSort.remove(qSort.size() - 1);
					}
				}else { // 중요도가 낮을 시
					Document tmp = q.get(0); // 맨 뒤로 이동
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
	private int index; // 문서 위치
	private int importance; // 문서 중요도
	
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