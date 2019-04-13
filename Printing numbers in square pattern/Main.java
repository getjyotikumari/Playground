import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int row_n= 1; row_n<=n;row_n++)
      {
        for(int col_n=1;col_n<=n;col_n++)
        {
          System.out.print(row_n);
        }
        System.out.println();
      }
	}
}