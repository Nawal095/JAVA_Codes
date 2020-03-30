import java.util.Scanner;
public class Task3
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[3];
    for(int i =1; i<=arr.length-1; i++)
    {
      arr[i]= sc.nextInt();
    }
    for(int i =arr.length-1; i>=0; i--)
    {
      System.out.print(arr[i]+" ");
    }
    
  }
}