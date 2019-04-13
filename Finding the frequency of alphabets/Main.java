import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      StringBuilder sb = new StringBuilder(str);
      int str_len = sb.length();
      int freq[]=new int[70];
      for(int i =0; i<70; i++)
      {
        freq[i]=0;
      }
      for(int i =0; i<str_len; i++)
      {
        if(sb.charAt(i)>='A'&&sb.charAt(i)<='Z')
        {
          int offset = sb.charAt(i)-'A';
          char ch = (char)('a'+offset);
          sb.setCharAt(i,ch);
        }
        if(sb.charAt(i)>='a'&&sb.charAt(i)<='z')
        {
          freq[sb.charAt(i)-'a']++;
        }
        
      }
      for(int j=0;j<str_len; j++)
      {
        if(freq[sb.charAt(j)-'a']!=0)
        {
          System.out.print(sb.charAt(j) +"" +freq[sb.charAt(j)-'a'] + " ");
          freq[sb.charAt(j)-'a']=0;
        }
      }
    }
}