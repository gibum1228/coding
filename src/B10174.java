import java.util.Scanner;

public class B10174 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt(); // Ƚ�� �Է� �ޱ�
		sc.nextLine(); // \n �����ϱ�
		
		for(int i = 0; i < testCase; i++) {
			String s = sc.nextLine();
			boolean judge = true; 

			for(int j = 0; j < s.length() / 2; j++) { // �հ� �ڸ� ���������� ��
				if(Character.toLowerCase(s.charAt(j)) != Character.toLowerCase(s.charAt(s.length()-j-1))) {
					judge = false; 
					
					break;
				}
			}
			
			if(judge) { // �Ӹ�����̸�
				System.out.println("Yes");
			}else { // �ƴϸ�
				System.out.println("No");
			}
		}
		
		sc.close();
	}

}
