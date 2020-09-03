import java.io.*;

public class B11179 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine()); // 숫자 입력 받기
		String binaryStr = Integer.toBinaryString(num); // 10진수 > 2진수
		binaryStr = new StringBuilder(binaryStr).reverse().toString(); // reverse()
		
		bw.write(Integer.parseInt(binaryStr, 2) + ""); // 2진수 > 10진수
		
		bw.flush();
		br.close();
	}

}
