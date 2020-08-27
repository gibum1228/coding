import java.io.*;
import java.util.Arrays;

public class B11931 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int [n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);
		
		for(int i = n-1; i >= 0; i--) {
			bw.write(String.valueOf(arr[i]) + "\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}

}
