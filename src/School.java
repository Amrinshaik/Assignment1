import java.util.Scanner;
class Student{
	int count=0;
	int subCount;
	int sub[];
	int sum=0;
void Inputs() 
{
	Scanner no=new Scanner(System.in);
	System.out.println("Enter number of students");
	count=no.nextInt();
	System.out.println("Enter number of subjects");
	subCount=no.nextInt();
	for(int i=0;i<=count;i++)
	{
		for(int j=0;j<=subCount;j++)
		{
			System.out.println("Enter the marks of student " +(i+1));
			sub[j]=no.nextInt();
		}
	}
	no.close();
}
void Calculate()
{
	for(int i=0;i<=sub.length;i++)
	{
		sum=sum+sub[i];
	}
	System.out.println("sum " +sum);
	System.out.println("avg " +(sum/subCount));
}
}
public class School {
	public static void main(String[] args) {
Student sem=new Student();
sem.Inputs();
sem.Calculate();

}
	
}