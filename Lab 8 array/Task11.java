import java.util.Scanner;
public class Task11{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[10];
    for(int i =0; i<arr.length; i++)
    {
      arr[i]= sc.nextInt();
      for(int j=0; j<i; j++)
      {
        if(arr[i]==arr[j])
        {
          System.out.println("You cannot enter duplicate numbers, enter again");
          i--;
          break;
        }
      }
    }
    for(int j =0; j<arr.length; j++)
    {
      System.out.println(arr[j]);
    }
    
  }
}