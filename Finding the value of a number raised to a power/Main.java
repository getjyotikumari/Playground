import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner in = new Scanner(System.in);
      int base = in.nextInt();
      int exponent = in.nextInt();
      int n = 0, res = 1;
      while(n<exponent)
      {
        res = res * base;
        n++;
      }
      System.out.println(res);
    }
}