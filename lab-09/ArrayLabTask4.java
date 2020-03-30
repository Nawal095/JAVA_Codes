import java.util.Scanner;
public class ArrayLabTask4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int sum=0;
        for(int c=0;c<a.length;c++){
            a[c]=sc.nextInt();
        }
        for(int c=0;c<a.length;c++){
            if(a[c]%2==1){
                System.out.println(a[c]);
                break;
            }
        }
    }
}