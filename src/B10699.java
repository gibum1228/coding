import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class B10699 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Date today = new Date();
	    SimpleDateFormat format1 = new SimpleDateFormat("YYYY-MM-dd");
	    String today_format = format1.format(today);
	    
	    System.out.println(today_format);
		
		sc.close();
	}

}
