import java.io.*;

public class B11557 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCase; i++) {
			int uniCount = Integer.parseInt(br.readLine());
			String[] uniName = new String [uniCount];
			int[] uniSoju = new int [uniCount];
			int max = 0;
			int maxIndex = 0;
			
			for(int j = 0; j < uniCount; j++) {
				String[] str = br.readLine().split(" ");
				
				uniName[j] = str[0];
				uniSoju[j] = Integer.parseInt(str[1]);
			}
			
			for(int k = 0; k < uniCount; k++) {
				if(uniSoju[k] > max) {
					max = uniSoju[k];
					maxIndex = k;
				}
			}
			
			bw.write(uniName[maxIndex] + "\n");
		}
		
		bw.flush();
		br.close();
	}

}
