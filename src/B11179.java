import java.io.*;

public class B11179 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine()); // ���� �Է� �ޱ�
		String binaryStr = Integer.toBinaryString(num); // 10���� > 2����
		binaryStr = new StringBuilder(binaryStr).reverse().toString(); // reverse()
		
		bw.write(Integer.parseInt(binaryStr, 2) + ""); // 2���� > 10����
		
		bw.flush();
		br.close();
	}

}
