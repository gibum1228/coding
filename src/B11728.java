import java.io.*;
import java.util.Arrays;

public class B11728 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str1 = br.readLine().split(" ");
		int testCase = Integer.parseInt(str1[0]) + Integer.parseInt(str1[1]);
		int[] arr = new int [testCase];
		
		String[] str2 = br.readLine().split(" ");
		for(int i = 0; i < str2.length; i++) {
			arr[i] = Integer.parseInt(str2[i]);
		}
		String[] str3 = br.readLine().split(" ");
		for(int j = Integer.parseInt(str1[0]); j < arr.length; j++) {
			arr[j] = Integer.parseInt(str3[j-Integer.parseInt(str1[0])]);
		}
		
		Arrays.sort(arr);
		
		for(int k = 0; k < arr.length; k++) {
			bw.write(arr[k] + " ");
		}
		
		bw.flush();
		br.close();
	}

}
