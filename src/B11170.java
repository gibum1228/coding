import java.io.*;

public class B11170 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCase = Integer.parseInt(br.readLine());
		int count;
		
		for(int i = 0; i < testCase; i++) {
			
			count = 0;
			String[] str = br.readLine().split(" ");
			int n = Integer.parseInt(str[0]);
			int m = Integer.parseInt(str[1]);
			
			for(int j = n; j <= m; j++) {
				
				String str2 = String.valueOf(j);
				for(int k = 0; k < str2.length(); k++) {
					
					if(str2.charAt(k) == '0') {
						count++;
					}
				}
			}
			
			System.out.println(count);
		}
		
		bw.flush();
		br.close();
	}

}
