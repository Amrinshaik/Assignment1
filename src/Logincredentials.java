
import java.util.Scanner;
public class Logincredentials {
public static void main(String[] args)
{
	
	String name, password;
	
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter user name and password");
	
	int i=0;
	while(i<=2)
	{
		name=obj.next();
		password=obj.next();
	if(name.equals(name="amrin")&& password.equals(password="@1234"))
	{
		
		System.out.println("Welcome "+name);
		break;
	}
	else
	{
		i++;
		name=null;
		password=null;
	}
	}
	if(i==3)
	{
	System.out.println("Contact Admin");
	System.exit(i);
	}
	obj.close();
}
}

