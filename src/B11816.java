import java.io.*;

public class B11816 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		if(str.charAt(0) != '0') { // 10진수
			System.out.println(str);
		}else if(str.charAt(1) != 'x') { // 8진수
			str = str.substring(1);
			trans(str, 8);
		}else { // 16진수
			str = str.substring(2);
			trans(str, 16);
		}
		
		br.close();
	}

	static void trans(String str, int op) { // op == 진수
		int result = 0;
		int pow = 0; // 제곱
		
		for(int i = str.length()-1; i >= 0; i--) {

			int n;
			if(str.charAt(i) == 0) {
				continue;
			}
			
			switch(str.charAt(i)) { // 16진수 전용 문자
			case 'a':
				n = 10;
				break;
			case 'b':
				n = 11;
				break;
			case 'c':
				n = 12;
				break;
			case 'd':
				n = 13;
				break;
			case 'e':
				n = 14;
				break;
			case 'f':
				n = 15;
				break;
			default:
				n = str.charAt(i) - 48; // '0' == 48
			}
			
			result += n * (int)Math.pow(op, pow++);
		}
		
		System.out.println(result);
	}
}
