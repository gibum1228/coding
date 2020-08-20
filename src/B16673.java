import java.util.Scanner;

public class B16673 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		int k = sc.nextInt();
		int p = sc.nextInt();
		int result = 0;
		
		for(int i = 1; i <= c; i++) {
			result += ((k*i) + (p*i*i));
		}
		
		System.out.println(result);
		
		sc.close();
	}

}
