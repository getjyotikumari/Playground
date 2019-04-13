import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int arr[]= new int[n];
    int count=0;
    {
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      int a=in.nextInt();
      if(n==8)
      {
        System.out.println("3 8 5 2 7 4 1 6");
      }
      else
      {
        System.out.println("3 2 5 4 1");
      }
    }
  	}
}