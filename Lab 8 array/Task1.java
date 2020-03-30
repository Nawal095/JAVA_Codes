import java.util.Scanner;
public class Task1{
  public static void main(String args[])
  {
    double[] arr = new double[3];
    Scanner sc = new Scanner(System.in);
    double sum =0;
    
    for(int i =0; i<3; i++)
    {
      arr[i]= sc.nextDouble();
    }
    
    for(int i =0; i<3; i++)
    {
      
      sum = sum + arr[i];
    }
    
    System.out.print(sum+" ");
    
    for(int i =0; i<3; i++)
    {
      
      System.out.print(arr[i]+" ");
    }
  }
}