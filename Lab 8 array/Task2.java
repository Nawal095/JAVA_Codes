import java.util.Scanner;
public class Task2
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[3];
    for(int i =0; i<arr.length; i++)
    {
      arr[i]= sc.nextInt();
    }
    for(int i =0; i<arr.length; i++)
    {
      System.out.print(i+": "+arr[i]+" ");
    }
    System.out.println("\nEnter a number");
    int n = sc.nextInt();
    System.out.print(arr[n]);
  }
}