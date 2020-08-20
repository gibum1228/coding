import java.util.Scanner;

public class B2960 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 초기화
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int [n+1];
		for(int i = 0; i < n + 1; i++) { // 2부터 n까지 배열 채우기
			arr[i] = i;
		}
		int count = 1;
		int start = 2; // 2부터 연산 시작
		
		doWhile: // label
		do {
			for(int i = 1; i * start <= n; i++) {
				
				if(arr[i*start] == 0) { // 이미 들린 지점이면 continue
					continue;
				}
				if(count == k) { // k번째 지워진 값 출력하기
					System.out.println(arr[i*start]);
					break doWhile; // doWhile: 종료
				}
				if(arr[i*start] != 0) { // 들린 값 0으로 만들기
					arr[i*start] = 0;
				}
				
				count++;
			}
			
			start++;
		}while(count <= k);
		
		sc.close();
	}

}
