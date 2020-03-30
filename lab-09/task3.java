  import java.util.Scanner;
  public class task3
  {
    
    public static void main(String args [])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("how many rows");
  int row=sc.nextInt();
  System.out.println("how many column");
  int col=sc.nextInt();
  for(int rowCount=1;rowCount<=row;rowCount++)
  {
  for(int num=1;num<=col;num++)
  {
    System.out.print("*");
  }
  System.out.println();
  }
  }
  }