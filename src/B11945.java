import java.io.*;

public class B11945 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		if(n == 0 || m == 0) {
			
		}else {
			for(int i = 0; i < n; i++) {
				
				String s = br.readLine();
				
				for(int j = m - 1; j >= 0; j--) {
					bw.write(s.charAt(j));
				}
				
				bw.write("\n");
			}
		}
		
		bw.flush();
		br.close();
		bw.close();
	}

}
