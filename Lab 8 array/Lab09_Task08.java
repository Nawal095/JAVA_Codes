import java.util.Scanner;
public class Lab09_Task08
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner (System.in);
    String[] a = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    
    System.out.println("please Enter number");
     int n = input.nextInt();
     
    if (n>=0 && n<=9)
    {
      System.out.println(a[n]);
    }
  }
}