import java.util.Scanner;
public class Lab09_Task09 {
    public static void main(String[] args) {
        
      Scanner input = new Scanner (System.in);
      int zeroCount=0,oneCount=0, twoCount=0, threeCount=0, fourCount=0, fiveCount=0, sixCount=0, sevenCount=0, eightCount=0, nineCount=0;
      for(int c=0;c<=15;c++){
          
        System.out.println("please enter number");
        int num = input.nextInt();
        if(num==0){
          ++zeroCount;
        }
        else if(num==1){
          ++oneCount;
        }
        else if(num==2)
        {
          ++twoCount;
        }
        else if(num==3)
        {
          ++threeCount;
        }
        else if(num==4)
        {
          ++fourCount;
        }
        else if(num==5)
        {
          ++fiveCount;
        }
        else if(num==6)
        {
          ++sixCount;
        }
        else if(num==7)
        {
          ++sevenCount;
        }
        else if(num==8)
        {
          ++eightCount;
        }
        else if(num==9)
        {
          ++nineCount;
        }
        else 
        {
          System.out.println("The number is invalid");
          --c;
        }
      }
        System.out.println("One is printed "+oneCount+" times");
        System.out.println("Two is printed "+twoCount+" times");
        System.out.println("Three is printed "+threeCount+" times");
        System.out.println("Four is printed "+fourCount+" times");
        System.out.println("Five is printed "+fiveCount+" times");
        System.out.println("Six is printed "+sixCount+" times");
        System.out.println("Seven is printed "+sevenCount+" times");
        System.out.println("Eight is printed "+eightCount+" times");
        System.out.println("Nine is printed "+nineCount+" times");
    }
}