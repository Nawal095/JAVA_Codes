import java.util.Scanner;
public class Lab09_Task011 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);  
        int a[]=new int[5];
        for(int i=0; i<=a.length-1; i++)
        {
          a[i]=input.nextInt();
        } 
        for(int i=0;i<=a.length-1;i++){
            
            for(int nextnum=i+1;nextnum<a.length;nextnum++){
                
              if(a[nextnum]<a[i]){ 
            int temp=a[i];
            a[i]=a[nextnum];
             a[nextnum]=temp;
                }
            }
            
            
        }
        
        for(int i=0;i<=a.length-1;i++){
          
          
         System.out.println(a[i]);
        
        
        }
        
        
        
        
    }
}
        