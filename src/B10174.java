import java.util.Scanner;

public class B10174 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt(); // 횟수 입력 받기
		sc.nextLine(); // \n 저장하기
		
		for(int i = 0; i < testCase; i++) {
			String s = sc.nextLine();
			boolean judge = true; 

			for(int j = 0; j < s.length() / 2; j++) { // 앞과 뒤를 순차적으로 비교
				if(Character.toLowerCase(s.charAt(j)) != Character.toLowerCase(s.charAt(s.length()-j-1))) {
					judge = false; 
					
					break;
				}
			}
			
			if(judge) { // 팰린드롬이면
				System.out.println("Yes");
			}else { // 아니면
				System.out.println("No");
			}
		}
		
		sc.close();
	}

}
