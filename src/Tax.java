import java.util.Scanner;
public class Tax {
	public static void main(String[] args) {
		int income;
		float tamt=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter CTC");
		income=in.nextInt();
		if(income>0 && income<18000)
		{
			System.out.println("Nil");
		}
		else if(income>181001 && income<300000)
		{
			tamt=(income*10)/100;
			System.out.println("tax amount" +tamt);
		}
		else if(income>300001 && income<500000)
		{
			tamt=income*20/100;
			System.out.println("tax amount" +tamt);
		}
		else if(income>500001 && income<1000000)
		{
			tamt=income*30/100;
			System.out.println("tax amount" +tamt);
		}
		else
		{
			System.out.println("invalid income");
		}
		in.close();
		}
	
}
