import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		
  		// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int t=0;
      for(int row_num = 1; row_num<=n; row_num++)
      {
       for(int col_num = 1; col_num<=row_num; col_num++)
       {
        if(t==0)
        {
         System.out.print("*");
          t=1;
        }
         else
         {
          System.out.print("#");
           t=0;
         }
       }
        System.out.println();
      }
      in.close();
    }
}