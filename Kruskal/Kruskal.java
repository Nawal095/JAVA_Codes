/**
 * Created by Nosh on 7/10/2017.
 */
import java.io.*;
import java.util.*;

public class Kruskal {
    public ArrayList<Edge> edges = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> sets = new ArrayList<>();
    public ArrayList<Edge> MST = new ArrayList<>();
    public int minWeight = 0;

    public Kruskal(String filePath) {
        try {
            Scanner reader = new Scanner(new File(filePath));

            while (reader.hasNextInt()) {
                edges.add(new Edge(reader.nextInt(), reader.nextInt(), reader.nextInt()));
            }

            reader.close();
        } catch (IOException e) {
            System.err.println("File not found");
        } catch (Exception e) {
            System.err.println("Invalid File");
        }

        //Creating disjoint Set for each vertices
        for (int i = 0; i < edges.size(); i++) {
            while (edges.get(i).u >= sets.size()) sets.add(new ArrayList<>());
            sets.get(edges.get(i).u).add(edges.get(i).u);

            while (edges.get(i).v >= sets.size()) sets.add(new ArrayList<>());
            sets.get(edges.get(i).v).add(edges.get(i).v);
        }

        //Sorting the edges incrementally according to their weight
        edges.sort(new Comparator<Edge>() {
            public int compare(Edge o1, Edge o2) {
                return o1.weight - o2.weight;
            }
        });

        //Creating minimum spanning tree
        for (int i = 0; i < edges.size(); i++) {
            Edge e = edges.get(i);
            int setU = findSet(e.u);
            int setV = findSet(e.v);

            if (setU != setV) {
                MST.add(e);
                minWeight += e.weight;
                union(setU, setV);
            }
        }
    }

    public void union(int setU, int setV) {
        for (int i = 0; i < sets.get(setV).size(); i++)
            sets.get(setU).add(sets.get(setV).get(i));
        sets.get(setV).clear();
        sets.get(setV).add(setU);
    }

    public int findSet(int v) {
        if (sets.get(v).get(0) == v) return v;
        return findSet(sets.get(v).get(0));
    }

    public void printMSTEdges() {
        for (Edge k : MST) System.out.println(k.weight);
        System.out.println();
    }

    public void printMinWeight() {
        System.out.println("Minimum Total Weight : " + minWeight);
    }
}

