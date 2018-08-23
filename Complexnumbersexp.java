import java.lang.*;
import java.util.*;
class Complexo
{
  int a,b;

  
  public void getdata()
  {
    Scanner u=new Scanner (System.in);


    System.out.println("enter the real number");



    a=u.nextInt();




    System.out.println("enter the imaginary number");
    b=ss.nextInt();



    ss.close();
  }
  public void displaydata()
  {
    System.out.println(a+"+"+b+"i");
  }
}

class Complexno
{
  public static void main(String [] aa)
  {
    Complexo t=new Complexo();
    t.getdata();
    t.displaydata();
  }
}