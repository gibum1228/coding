import java.util.Scanner;

public class B11966 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int i = 1;
		while(true) {
			if(i == n) { // i와 n이 같으면 제곱
				
				System.out.println(1);
				break;
			}else if(i > n) { // i가 n보다 더 크면 제곱이 아님
				
				System.out.println(0);
				break;
			}else { // 2 씩 계속 곱함
				i *= 2;
			}
		}
		
		sc.close();
	}

}
