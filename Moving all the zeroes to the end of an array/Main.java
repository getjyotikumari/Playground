import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[]= new int[n];
      for(int i = 0; i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      for(int j =1;j<=n;j++)
      {
        for(int i=0;i<(n-1);i++)
        {
          if(arr[i]==0)
          {
           arr[i]=arr[i+1];
            arr[i+1]=0;
          }
        }
      }
      for(int i=0;i<n;i++)
      {
        System.out.print(arr[i]+" ");
      }
    }
}