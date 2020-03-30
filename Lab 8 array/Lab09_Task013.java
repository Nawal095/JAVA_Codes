import java.util.Scanner;
public class Lab09_Task013 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        
        int a[]=new int[5];
        for(int i=0; i<=a.length-1; i++)
        {
          a[i]=input.nextInt();
        }
        
        int largest=a[0];
         int smallest=a[0];
        int locationlargest=0;
        int locationsmallest=0;
        for(int i=1;i<=a.length-1;i++)
        {
          if(a[i]>largest)
          {
          largest=a[i];
           locationlargest= i;
          }
        }
         
        for(int i=1;i<=a.length-1;i++)
        {
          if(a[i]<smallest)
          {
          smallest=a[i];
           locationsmallest= i;
          }
        }
        
        
        System.out.println("Largest=" + largest + "In Location=" + locationlargest);
        System.out.println("Smallest=" + smallest + "In Location=" + locationsmallest);
    }
}
        