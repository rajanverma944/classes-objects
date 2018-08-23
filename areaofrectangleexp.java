import java.util.Scanner;
class calc
{ 
	int a,b;
	calc(int w,int e)
	{
		a=w;
		b=e;
	}

	void  display()
	{
		System.out.println("area of the rectange is"+"\t"+2*(a+b));
	}
}
class recarea
{
	public static void main(String args[])
	{
       calc n;
        Scanner s=new Scanner(System.in);
        int g=s.nextInt();
        int h=s.nextInt();
       n=new calc(g,h);
       n.display();
       }
}

