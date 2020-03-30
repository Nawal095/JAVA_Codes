/**
 * Created by Nosh on 7/11/2017.
 */
public class KruskalTester {
    public static void main(String... args) {
        Kruskal k = new Kruskal("input.txt");
        k.printMSTEdges();
        k.printMinWeight();
    }
}
