import java.util.Scanner;
public class Task13{
  
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[6];
    int sumEven=0;
    int sumOdd=0;
    int sumFive=0;
    for(int i =0; i<arr.length; i++)
    {
      arr[i]=sc.nextInt();
      if(arr[i]%2==0)
      {
        sumEven = sumEven+ arr[i];
      }
      if(arr[i]%2!=0)
      {
        sumOdd = sumOdd +arr[i];
      }
      if(arr[i]%5==0)
      {
        sumFive = sumFive + arr[i];
      }
      
    }
    System.out.println(sumEven);
    System.out.println(sumOdd);
    System.out.println(sumFive);
  }
}