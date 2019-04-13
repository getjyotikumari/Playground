import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int list[] = new int[n];
    for(int index = 0; index < n; index++)
    {
      list[index] = in.nextInt();
    }
    batch(list,n);
  }
  public static void batch(int list[], int n)
  {
    boolean perfect=true;
    int sum=list[0]+list[1]+list[2];
    for(int index = 3; index<=n-1;index = index + 3)
    {
      int curr_sum=list[index]+list[index+1]+list[index+2];
      if(curr_sum!=sum)
      {
        perfect=false;
      }
    }
    if(perfect==true)
    {
      System.out.println("Perfect Batch");
    }
    else
    {
      System.out.println("Not a Perfect Batch");
    }
  }
}