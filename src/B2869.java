import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class B2869 {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // ���� �ӵ��� ���� ��ū ���
        
		int up = Integer.parseInt(st.nextToken()); // ��
		int down = Integer.parseInt(st.nextToken()); // ��
		int length = Integer.parseInt(st.nextToken()); // �ö󰡾� �� ����
 
		int day = (length - down) / (up - down); // �� ���ϱ�
		if ((length - down) % (up - down) != 0) { // �������� ���� ��� �� �� �� �ö󰼾� �ϱ� ������
			day++; // +1
		}
 
		System.out.println(day); // day ���
	}
}