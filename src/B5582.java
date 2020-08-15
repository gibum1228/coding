import java.util.Scanner;

public class B5582 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String b = sc.nextLine();
		int[][] m = new int [a.length()][b.length()]; // dp
		int result = 0; // �����
		
		for(int i = 0; i < a.length(); i++) {
			for(int j = 0; j < b.length(); j++) {
				
				if(a.charAt(i) == b.charAt(j)) {
					
					if(i == 0 || j == 0) { // ���ڰ� ������ ���ϴ� ���ڰ� ù�����̸� 1
						m[i][j] = 1;
						result = Math.max(result, m[i][j]);
						continue;
					}
					
					m[i][j] = m[i-1][j-1] + 1; // ���� �κ� ���ڿ��̸� ���� �ε����� +1
					result = Math.max(result, m[i][j]); 
				}
			}
		}
		
		System.out.println(result);
		
		sc.close();
	}

	
}
