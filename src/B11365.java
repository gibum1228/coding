import java.io.*;

public class B11365 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String str = new StringBuilder(br.readLine()).reverse().toString();
			
			if(str.compareTo("DNE") == 0) {
				break;
			}
			
			bw.write(str + "\n");
		}
		
		bw.flush();
		br.close();
	}

}
