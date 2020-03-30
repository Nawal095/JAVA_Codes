import java.util.Scanner;
public class ArrayLabTask9
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int sum=0;
        for(int c=0;c<a.length;c++){
            a[c]=sc.nextInt();
        }
        System.out.println("Please enter a number between");
        int b=sc.nextInt();
        boolean flag=false;
        for(int c=0;c<a.length;c++){
            if(a[b]==a[c]){
                flag=true;
                break;
            }
        }
            if(flag==true){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
    }
       
}
        
                
                
            