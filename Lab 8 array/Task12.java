import java.util.Scanner;
public class Task12
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int []arr = new int[10];
    int odd[] = new int[10];
    int index[] = new int[10];
    int j =0;
    for(int i =0; i<arr.length; i++)
    {
      arr[i] = sc.nextInt();
      if(arr[i]%2==0)
      {
        odd[j]= arr[i];
        index[j]=i;
        j++;
      }
    }
    for(int i =0; i<arr.length; i++)
    {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    for(int k=j-1; k>=0; k--)
    {
      System.out.println(+odd[k]+" "+index[k]+" ");
    }
    
  }
}
