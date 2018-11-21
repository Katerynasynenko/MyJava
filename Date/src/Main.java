import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args)  {
		
		//SimpleDate format is a concrete class for formatting and parsing date which inherits
		// java.text.Dateformat class
		//formating means converting date to String, and parsing means converting string to date 
		
		Date date = new Date();    // current date
		System.out.println(date);
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  // MM-month mm-minute 
		String strDate = formatter.format(date);
		System.out.println(strDate);
		
		formatter  = new SimpleDateFormat("MM/dd/yyyy");  // formater is an object of SimpleDateFormat class
		strDate = formatter.format(date);
		System.out.println(strDate);
		
		formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		strDate = formatter.format(date);
		System.out.println(strDate);
		
		formatter = new SimpleDateFormat("dd MMMM yyyy");
		strDate = formatter.format(date);
		System.out.println(strDate);
		
		formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");
		strDate = formatter.format(date);
		System.out.println(strDate);
		
		formatter = new SimpleDateFormat("EEEE,dd MMM yyyy HH:mm:ss z");
		strDate = formatter.format(date);
		System.out.println(strDate);
		
		// Convert String to the Date
		
		formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			date = formatter.parse("31/03/2015");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(date);
		
	}

}






















