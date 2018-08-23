import java.util.Scanner;
class wavesformsort
{
public static void main(String args[])
{

Scanner o=new Scanner(System.in);

int[] a=new int[100];

int i,j,t,l;

System.out.println("Enter elements from 1 to 10:");




for(i=0;i<10;i++)
{
a[i]=o.nextInt();
}



for(i=0;i<10;i=i+2)
{
for(j=i;j<=i+1;j++)
{
if(a[i]<=a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}



for(i=0;i<10;i++)
{
System.out.println(a[i]+" ");
}
}
}