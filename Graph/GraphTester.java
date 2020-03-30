/**
 * Created by Nosh on 5/24/2017.
 */
public class GraphTester {
    public static void main(String... args) {
        Graph g = new Graph("D:/file.txt");
        g.printMatrix();
        g.printList();
//        g.dumpMatrix();
//        g.dumpList();
        g.bfs(3);
    }
}
