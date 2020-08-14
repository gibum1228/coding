import java.util.Scanner;

public class B16483 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		// a^2 = b^2 + (T/2)^2이다. (피타고라스의 정리)
		System.out.println((int)Math.round(Math.pow((t/2.0), 2)));
		
		sc.close();
	}

}
