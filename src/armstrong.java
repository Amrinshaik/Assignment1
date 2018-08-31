
public class armstrong {
public static void main(String[] args) {
	int i;
	for(i=100;i<=1000;i++)
	{
        int n=i;
       int x=0; 
       int y=0;
		while(n>0)
		{
			x=n%10;
			y=y+(x*x*x);
			n=n/10;
		}
		if(i==y)
		{
			System.out.println(+i);
		}
	}
}
}
