import java.io.*;

public class B11653 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testN = Integer.parseInt(br.readLine());
		int i = 2;
		
		while(true) {
			if(testN % i == 0) {
				testN /= i;
				bw.write(i + "\n");
				continue;
			}
			
			if(testN % i != 0) {
				i++;
			}
			
			if(testN == 1) {
				break;
			}
		}
		
		bw.flush();
		br.close();
	}

}
