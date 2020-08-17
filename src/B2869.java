import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class B2869 {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 빠른 속도를 위해 토큰 사용
        
		int up = Integer.parseInt(st.nextToken()); // 낮
		int down = Integer.parseInt(st.nextToken()); // 밤
		int length = Integer.parseInt(st.nextToken()); // 올라가야 할 길이
 
		int day = (length - down) / (up - down); // 몫 구하기
		if ((length - down) % (up - down) != 0) { // 나머지가 있을 경우 한 번 더 올라갸야 하기 때문에
			day++; // +1
		}
 
		System.out.println(day); // day 출력
	}
}