import java.util.Scanner;

public class B18406 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int left = 0, right = 0, size = s.length();
		
		for(int i = 0; i < (size / 2); i++) {
			left += (int)s.charAt(i);
		}
		for(int i = size / 2; i < size; i++) {
			right += (int)s.charAt(i);
		}
		
		if(left == right) {
			System.out.println("LUCKY");
		}else {
			System.out.println("READY");
		}
		
		sc.close();
	}

}
