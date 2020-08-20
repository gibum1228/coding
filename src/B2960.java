import java.util.Scanner;

public class B2960 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// �ʱ�ȭ
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int [n+1];
		for(int i = 0; i < n + 1; i++) { // 2���� n���� �迭 ä���
			arr[i] = i;
		}
		int count = 1;
		int start = 2; // 2���� ���� ����
		
		doWhile: // label
		do {
			for(int i = 1; i * start <= n; i++) {
				
				if(arr[i*start] == 0) { // �̹� �鸰 �����̸� continue
					continue;
				}
				if(count == k) { // k��° ������ �� ����ϱ�
					System.out.println(arr[i*start]);
					break doWhile; // doWhile: ����
				}
				if(arr[i*start] != 0) { // �鸰 �� 0���� �����
					arr[i*start] = 0;
				}
				
				count++;
			}
			
			start++;
		}while(count <= k);
		
		sc.close();
	}

}
