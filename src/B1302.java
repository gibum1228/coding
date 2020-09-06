import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class B1302 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCase = Integer.parseInt(br.readLine());
		ArrayList<String> bookList = new ArrayList<>();
		int max = -1;
		String maxBook = "";
		
		for(int i = 0; i < testCase; i++) {
			bookList.add(br.readLine());
		}
		
		Collections.sort(bookList);
		
		int i = 0;
		while(i < testCase) {
			String focusStr = bookList.get(i);
			
			if(max < (bookList.lastIndexOf(focusStr) - bookList.indexOf(focusStr) + 1)) {
				max = bookList.lastIndexOf(focusStr) - bookList.indexOf(focusStr) + 1;
				maxBook = focusStr;
				i = bookList.lastIndexOf(focusStr) + 1;
			}else {
				i = bookList.lastIndexOf(focusStr) + 1;
			}
		}
		
		bw.write(maxBook);
		
		bw.flush();
		br.close();
	}

}
