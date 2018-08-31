import java.util.Scanner;
public class Square {
	public static void main(String[] args) {
		int input, square;
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the number:");
		input=x.nextInt();
		square=input*input;
		System.out.print(input+"*1="+input+", ");
		System.out.print("Square:" +square);
		x.close();
	}
	
}
