import java.util.Scanner;

public class B1676 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		String s = "1";
		int count = 0; // 0�� ������ ���ϴ� ����
		
		for(int i = 2; i <= n; i++) {
			s = Long.toString(Long.parseLong(s) * i); // fac
			
			for(int j = s.length() - 1; j >= 0; j--) { // �ڿ������� 
				if(s.charAt(j) == '0') { // 0�� �ִٸ�
					
					s = s.substring(0, s.length() - 1); // ������ 0�� ����
					count++; // 0�� ����++
					continue;
				}else { // 0�� ������ ����
					
					break;
				}
			}
			
			if(s.length() > 15) { // �ִ� 15��
				s = s.substring(s.length() - 15);
			}
		}
		
		System.out.println(count);
		
		sc.close();
	}

}
