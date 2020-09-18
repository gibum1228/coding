import java.util.Scanner;

public class B10833 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();
		int result = 0; // 남는 사과 수
		
		for(int i = 0; i < testCase; i++) {
			int sCount = sc.nextInt();
			int aCount = sc.nextInt();

			result += (aCount % sCount);
		}
		
		System.out.println(result);
		
		sc.close();
	}

}
