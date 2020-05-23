import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Aula30_DateCalendario {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date atual = new Date();
		
		System.out.println(formato1.format(atual));
		System.out.println(formato2.format(atual));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(atual);
		cal.add(Calendar.DAY_OF_YEAR, 60);
		atual = cal.getTime();
		
		System.out.println("------------");
		System.out.println(formato1.format(atual));
		
	}

}