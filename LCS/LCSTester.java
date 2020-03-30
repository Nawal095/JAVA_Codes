/**
 * Created by Nosh on 7/18/2017.
 */
import java.util.Scanner;

public class LCSTester {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Input 1st String : ");
//        String s1 = sc.nextLine();
//        System.out.println("Input 2nd String : ");
//        String s2 = sc.nextLine();

        LCS l = new LCS("batman" , "binladen");
        l.printValues();
        System.out.println();
        l.printTrack();
    }
}
