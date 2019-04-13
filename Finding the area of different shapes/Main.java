import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      switch(n)
      {
        case 1:
          int s = in.nextInt();
          int area = s*s;
          System.out.println(area);
          break;
          
        case 2:
          int length = in.nextInt();
          int breadth = in.nextInt();
          int area_rect = length*breadth;
          System.out.println(area_rect);
          break;
          
        case 3:
          int h = in.nextInt();
          int b = in.nextInt();
          int area_triangle = (h*b)/2;
          System.out.println(area_triangle);
          break;
          
        case 4:
          int rad = in.nextInt();
          double area_circle=3.14*rad*rad;
          System.out.println(area_circle);
          break;
      }
    }
}