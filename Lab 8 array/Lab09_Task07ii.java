import java.util.Scanner;
public class Lab09_Task07ii{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int a[]=new int[8];
        for(int i=0;i<a.length;i++){
            System.out.println("please enter number");
           
            a[i]=input.nextInt();
        }
     
         
        for(int i=0;i<a.length;i++){
            if(i%2==0){   
            System.out.print(a[i]+" ");
            }
        }
         for(int i=0;i<a.length;i++){
            if( i%2!=0){
            System.out.print(a[i]+" ");
            }
        }
    }
}
