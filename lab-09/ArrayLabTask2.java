import java.util.Scanner;
public class ArrayLabTask2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int sum=0;
        for(int c=0;c<a.length;c++){
            a[c]=sc.nextInt();
        }
        System.out.println("Please enter a number between 0 to 9");
        int b=sc.nextInt();
        for(int c=0;c<a.length;c++){
            if(a[b]==a[c]){
                System.out.println(a[b]);
            }
               }
}
}

     
        
                
               
               
        
        