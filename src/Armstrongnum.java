import java.util.Scanner;
public class Armstrongnum {
public static void main(String[] args) {
	int input, temp, x, eval=0;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter number");
	input=obj.nextInt();
	temp=input;
	while(input>0)
	{
		x=input%10;
		input=input/10;
		eval=eval+(x*x*x);
	}
	if(temp==eval)
	{
		System.out.println("Armstrong");
	}
	else
	{
		System.out.println("Not Armstrong");
	}
	obj.close();
}
}
