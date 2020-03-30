import java.io.*;
import java.util.*;

public class Graph {
    public int length;
    public int[][] arrayMatrix;
    public Node[] arrayList;
    public boolean directed;

    public Graph(String filePath) {
        try {
            Scanner reader = new Scanner(new File(filePath));
            String type = reader.nextLine();
            if(type.equalsIgnoreCase("directed")) directed = true;
            else if(type.equalsIgnoreCase("undirected")) directed = false;
            length = Integer.parseInt(reader.nextLine());
            arrayMatrix = new int[length][length];

            //initialize List
            arrayList = new Node[length];
            for(int i = 0; i < arrayList.length; ++i) arrayList[i] = new Node(i + 1, null);

            // Build Matrix
            while(reader.hasNext()) {
                String[] input = reader.nextLine().split(",");

                int source = Integer.parseInt(input[0]);
                int destination = Integer.parseInt(input[1]);
                int weight = input.length < 3 ? 1 : Integer.parseInt(input[2]);

                arrayMatrix[source - 1][destination - 1] = weight;
                if(directed == false) arrayMatrix[destination - 1][source - 1] = weight;
                arrayList[source - 1].add(destination);
            }





        }
        catch(IOException e) {
            System.err.println("File not found");
        }

        catch(Exception e) {
            System.err.println("Invalid File");
        }

    }

    public void printMatrix() {
        System.out.println("Matrix:\n");
        System.out.print("    ");
        for(int i = 1 ; i <= length ; ++i) System.out.print(i + "  ");
        System.out.println("\n");
        for(int i = 0 ; i < length ; ++i) {
            System.out.print(i + 1 + "   ");
            for(int j = 0 ; j < length ; ++j) {
                System.out.print(arrayMatrix[j][i] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void printList() {
        System.out.println("List:\n");

        for(int i = 0 ; i < arrayList.length ; ++i) {
            System.out.print(arrayList[i].element);
            for(Node n = arrayList[i].next; n != null; n = n.next) System.out.print( " -> " + n.element);
            System.out.println();
        }


    }

    public void dumpMatrix() {
        try{
            PrintWriter pw = new PrintWriter("outputMatrix.txt", "UTF-8");
            pw.println("Matrix:\n");
            pw.print("    ");
            for(int i = 1 ; i <= length ; ++i) pw.print(i + "  ");
            pw.println("\n");
            for(int i = 0 ; i < length ; ++i) {
                pw.print(i + 1 + "   ");
                for(int j = 0 ; j < length ; ++j) {
                    pw.print(arrayMatrix[j][i] + "  ");
                }
                pw.println();
            }
            pw.println();
            pw.close();
        }
        catch (IOException e) {
            System.err.println(e);
        }
    }

    public void dumpList() {
        try{
            PrintWriter pw = new PrintWriter("outputList.txt", "UTF-8");
            pw.println("List:\n");

            for(int i = 0 ; i < length ; ++i) {
                pw.print(i + 1);
                for(int j = 0 ; j < length ; ++j) pw.print((arrayMatrix[i][j] == 0 ? "" : (" -> " + (j + 1))) + (arrayMatrix[i][j] > 1 ? ("(" + arrayMatrix[i][j] + ")") : ""));
                pw.println();
            }
            pw.println();
            pw.close();
        }
        catch (IOException e) {
            System.err.println(e);
        }
    }

    public void bfs(int source) {
        Node s = arrayList[source - 1];
        Queue q = new LinkedList();

        s.color = 1;
        s.lvl = 0;
        q.add(s);

        while(!q.isEmpty()) {
            Node d = (Node)q.remove();

            for(Node m = d.next ; m != null ; m = m.next) {
                Node n = arrayList[((int)m.element) - 1];
                if(n.color == 0) {
                    n.color = 1;
                    n.lvl = d.lvl + 1;
                    q.add(n);
                    n.parent = d;
                }
            }
            d.color = 2;
        }

        System.out.println("Source " + s.element);
        for(int i = 0 ; i < arrayList.length ; ++i) {
            System.out.println(arrayList[i].element +  "\t" + arrayList[i].lvl);
        }

    }
}
