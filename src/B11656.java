import java.io.*;
import java.util.Arrays;

public class B11656 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		String[] strArr = new String [str.length()];
		
		for(int i = 0; i < strArr.length; i++) {
			strArr[i] = str.substring(i);
		}

		Arrays.sort(strArr);
		
		for(int i = 0; i < strArr.length; i++) {
			bw.write(strArr[i] + "\n");
		}
		
		bw.flush();
		br.close();
	}

}
