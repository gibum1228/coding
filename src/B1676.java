import java.util.Scanner;

public class B1676 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		String s = "1";
		int count = 0; // 0의 갯수를 구하는 변수
		
		for(int i = 2; i <= n; i++) {
			s = Long.toString(Long.parseLong(s) * i); // fac
			
			for(int j = s.length() - 1; j >= 0; j--) { // 뒤에서부터 
				if(s.charAt(j) == '0') { // 0이 있다면
					
					s = s.substring(0, s.length() - 1); // 마지막 0을 제거
					count++; // 0의 갯수++
					continue;
				}else { // 0이 없으면 종료
					
					break;
				}
			}
			
			if(s.length() > 15) { // 최대 15자
				s = s.substring(s.length() - 15);
			}
		}
		
		System.out.println(count);
		
		sc.close();
	}

}
