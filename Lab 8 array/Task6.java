import java.util.Scanner;
public class Task6
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[10];
    for(int i =0; i<arr.length; i++)
    {
      arr[i]= sc.nextInt();
    }
    int sum =0;
    for(int i =0; i<arr.length; i++)
    {
      if(arr[i]%2!=0){
        sum =arr[i];
      }
    }
    System.out.println(sum);
    
  }
}