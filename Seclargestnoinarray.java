import java.util.Scanner;
class Secondlargest
{
public static void main(String args[])
{


Scanner p=new Scanner(System.in);


int[] a=new int[100];


int i,j,t,l;


System.out.println("Enter the elements for an array");


for(i=0;i<10;i++)
{
a[i]=p.nextInt();
}
for(i=0;i<10;i++)
{
for(j=i;j<10;j++)
{
   if(a[i]<a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}

l=a[1];

System.out.println("Second largest element in the array is"+l);
}
}