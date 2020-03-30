import java.util.Scanner;
public class Lab09_Task060 { 
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        
        System.out.println("Please enter  number");
        int num=input.nextInt();
        
        int a[]=new int[num];
        
         for(int i=0;i<num;i++){
            a[i]=input.nextInt();
         }
         
        for(int i=0;i<num;i++){
            for(int nextnum=i+1;nextnum<a.length;nextnum++){
                if(a[nextnum]<a[i]){ 
            int temp=a[i];
            a[i]=a[nextnum];
             a[nextnum]=temp;
                }
            }
        }
        
        
        for(int i=0;i<num;i++){
            System.out.println(a[i]);
    }
        
        
        if(num%2==1){
            int middle=(num+1)/2;
            
            System.out.print("Median is"+a[middle-1]);
        }
        
        
        else if(num%2==0){
            int middle=(num)/2;
            int med=(a[middle-1]+a[middle])/2;
            System.out.print("Median is"+ med);
        }
    }
}
            

