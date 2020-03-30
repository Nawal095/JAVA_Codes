
import java.util.*;
import java.io.*;

public class HeapsortTester {
    public static void main(String... args) {
        try {
            Scanner reader = new Scanner(new File("E:\\Array.txt"));
            String[] input = reader.next().split(",");
            int[] arr = new int[input.length + 1];
            for(int i = 0 ; i < input.length ; ++i) arr[i + 1] = Integer.parseInt(input[i]);
            Heapsort hs = new Heapsort(arr);
            PrintWriter pw = new PrintWriter("SortedArray.txt","UTF-8");
            for (int i = 1 ; i < arr.length ; ++i) pw.print(arr[i] + (i < arr.length - 1 ? "," : ""));
            pw.close();
        }

        catch(IOException e) {
            System.err.println("File not found");
        }

        catch(Exception e) {
            System.err.println("Invalid File");
        }


    }
}
