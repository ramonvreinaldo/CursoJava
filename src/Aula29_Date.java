import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aula29_Date {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date atual = new Date();

		Date y1 = formato1.parse("22/05/2020");
		Date y2 = formato2.parse("22/05/2020 15:54:07");
		
		System.out.println(formato1.format(y1));
		System.out.println(formato2.format(y2));
		
		System.out.println("-----------------");
		
		System.out.println(formato1.format(atual));
		System.out.println(formato2.format(atual));
	}

}
