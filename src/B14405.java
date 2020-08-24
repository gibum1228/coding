import java.util.Scanner;

public class B14405 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		
		int i = 0;
		while(i < s.length()) {
			if(s.charAt(i) == 'p' && i + 1 < s.length()) {
				if(s.charAt(i+1) == 'i') {
					i += 2;
					continue;
				}
				
				System.out.println("NO");
				break;
			}else if(s.charAt(i) == 'k' && i + 1 < s.length()) {
				if(s.charAt(i+1) == 'a') {
					i += 2;
					continue;
				}
				
				System.out.println("NO");
				break;
			}else if(s.charAt(i) == 'c' && i + 2 < s.length()){
				if(s.charAt(i+1) == 'h') {
					if(s.charAt(i+2) == 'u') {
						i += 3;
						continue;
					}
					
					System.out.println("NO");
					break;
				}
				
				System.out.println("NO");
				break;
			}else {
				System.out.println("NO");
				break;
			}
		}

		if(i >= s.length()) {
			System.out.println("YES");
		}
		
		sc.close();
	}

}
