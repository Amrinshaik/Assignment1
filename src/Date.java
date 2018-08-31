import java.io.IOException;
import java.text.DateFormatSymbols;
import java.util.Scanner;
public class Date {
	public static void main(String[] args) throws IOException {
		int a;
		Scanner Date=new Scanner(System.in);
		String name=Date.nextLine();
		String[] date=name.split(",");
		System.out.println(date);
		int x=Integer.parseInt(date[1]);
		String monthString;
		monthString=new DateFormatSymbols().getMonths()[x-1];
		System.out.println(date[0]+"/" +monthString+"/" +date[2]);
		a=date.length;
		Date.close();
}
}
