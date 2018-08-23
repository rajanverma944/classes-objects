import java.util.*;
import java.lang.*;
class Staticexperiment1
{
  static void hello()
  {
    System.out.print("stat ");
  }
  void world()
  {
    System.out.print("this is block example!!!");
  }
  public static void main(String [] aa)
  {
     Staticexperiment1 mm=new Staticexperiment1();
     hello();
     mm.world();
  }
}