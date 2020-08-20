import java.util.Scanner;

public class B16430 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int result = b - a;
		
		if(result > 0) {
			System.out.println(result + " " + b);
		}
		
		sc.close();
	}

}
