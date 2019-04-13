import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      int str_len = str.length();
      String rev = "";
      for(int i = str_len-1; i >= 0; i--)
      {
        rev = rev + str.charAt(i);
      }
      if(str.equals(rev))
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    } 
}