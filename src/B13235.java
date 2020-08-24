import java.util.Scanner;

public class B13235 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		String rS = new StringBuffer(s).reverse().toString();
		
		if(s.compareTo(rS) == 0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		sc.close();
	}

}
