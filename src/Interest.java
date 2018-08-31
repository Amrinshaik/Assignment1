import java.util.Scanner;
public class Interest {
	
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	double principle, rate, years, si, ci;
	System.out.println("Enter principle amount");
	principle=p.nextDouble();
	System.out.println("Enter rate of interest");
	rate=p.nextDouble();
	System.out.println("Enter years");
	years=p.nextDouble();
	si=(principle*years*rate)/100;
	ci=principle * Math.pow(1.0+rate/100.0, years) - principle;
	System.out.println("simple interest is" +si);
	System.out.println("compound interest is" +ci);
	p.close();
}
}
