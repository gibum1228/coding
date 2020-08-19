import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;

public class B1874 {

	static int stackN = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack s = new Stack();
		// init
		int n = sc.nextInt();
		ArrayList<Character> result = new ArrayList<>();
		boolean err = false;
		
		// 연산
		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			
			if(num > stackN) {
				for(int j = stackN + 1; j <= num; j++) {
					result.add('+');
					s.push(j);
				}
				result.add('-');
				s.pop();
				stackN = num;
			}else {
				
				if((int)s.pop() == num) {
					result.add('-');
				}else {
					err = true; // 에러 있음
				}
			}
		}
		
		// 에러 판단 여부
		if(err) {
			System.out.println("NO");
		}else {
			// print
			for(int i = 0; i < result.size(); i++) {
				System.out.println(result.get(i));
			}
		}
		
		sc.close();
	}

}
