import java.util.Scanner;

public class B9252 {

	public static void main(String[] args) { // LCS ( 최장 공통 부분 수열)
		Scanner sc = new Scanner(System.in);

		String a = sc.next(); // 두 문자열 입력 받기
		String b = sc.next();
		String result = ""; // 최장 공통 부분 문자열
		
		int[][] m = new int [a.length()+1][b.length()+1]; // 배열 초기화
		for(int i = 0; i < b.length()+1; i++) { // 0번 인덱스 행과 열은 0으로 초기화
			m[0][i] = 0;
		}
		for(int i = 0; i < m.length; i++) {
			m[i][0] = 0;
		}
		
		// 동적 프로그래밍
		for(int i = 1; i < m.length; i++) {
			
			for(int j = 1; j < m[i].length; j++) {
				
				if(a.charAt(i-1) == b.charAt(j-1)) { // 문자가 같을 경우
					m[i][j] = m[i-1][j-1] + 1; // i-1, j-1에 있는 숫자 + 1
				}else {
					m[i][j] = Math.max(m[i-1][j], m[i][j-1]); // 문자가 다르면 둘 중 큰 숫자를 입력
				}
				
			}
		}
		
		// 문자 역추적
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