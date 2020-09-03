import java.util.Scanner;

public class B9252 {

	public static void main(String[] args) { // LCS ( ���� ���� �κ� ����)
		Scanner sc = new Scanner(System.in);

		String a = sc.next(); // �� ���ڿ� �Է� �ޱ�
		String b = sc.next();
		String result = ""; // ���� ���� �κ� ���ڿ�
		
		int[][] m = new int [a.length()+1][b.length()+1]; // �迭 �ʱ�ȭ
		for(int i = 0; i < b.length()+1; i++) { // 0�� �ε��� ��� ���� 0���� �ʱ�ȭ
			m[0][i] = 0;
		}
		for(int i = 0; i < m.length; i++) {
			m[i][0] = 0;
		}
		
		// ���� ���α׷���
		for(int i = 1; i < m.length; i++) {
			
			for(int j = 1; j < m[i].length; j++) {
				
				if(a.charAt(i-1) == b.charAt(j-1)) { // ���ڰ� ���� ���
					m[i][j] = m[i-1][j-1] + 1; // i-1, j-1�� �ִ� ���� + 1
				}else {
					m[i][j] = Math.max(m[i-1][j], m[i][j-1]); // ���ڰ� �ٸ��� �� �� ū ���ڸ� �Է�
				}
				
			}
		}
		
		// ���� ������
		int i = m.length - 1, j = m[0].length - 1;
		while(i > 0 && j > 0) {
			if(a.charAt(i-1) == b.charAt(j-1)) {
				result += a.charAt(i-1);
				i--;
				j--;
			}else if(m[i][j] == m[i-1][j]) {
				i--;
			}else if(m[i][j] == m[i][j-1]) {
				j--;
			}
		}
		
		System.out.println(m[a.length()][b.length()]);
		System.out.println(new StringBuilder(result).reverse().toString());
		
		sc.close();
	}

}