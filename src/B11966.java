import java.util.Scanner;

public class B11966 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int i = 1;
		while(true) {
			if(i == n) { // i�� n�� ������ ����
				
				System.out.println(1);
				break;
			}else if(i > n) { // i�� n���� �� ũ�� ������ �ƴ�
				
				System.out.println(0);
				break;
			}else { // 2 �� ��� ����
				i *= 2;
			}
		}
		
		sc.close();
	}

}
