import java.util.Scanner;

public class B11943 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// init_
		int apple1 = sc.nextInt();
		int orange1 = sc.nextInt();
		int apple2 = sc.nextInt();
		int orange2 = sc.nextInt();
		int maxA = (int)Math.max(apple1, apple2); // 바구니의 최고값들
		int maxO = (int)Math.max(orange1, orange2);
		int result = 0;
		
		if(apple1 >= apple2) {
			if((apple2 + orange1) <= (apple1 + orange2)) {
				result = apple2 + orange1;
			}else {
				result = apple1 + orange2;
			}
		}else {
			if((apple1 + orange2) <= (apple2 + orange1)) {
				result = apple1 + orange2;
			}else {
				result = apple2 + orange1;
			}
		}
		
		System.out.println(result);
		
		sc.close();
	}

}
