/**
 * Created by Nosh on 7/4/2017.
 */
import java.util.*;

public class DFS {
    public int clusters = 0;
    public int size = 0;
    public int n;
    public int[][] grid;
    public int[][] color;

    public DFS(int input) {
        n = input;
        grid = new int[n][n];
        color = new int [n][n];
        Random r = new Random();
        for(int i = 0 ; i < n ; ++i) {
            for(int j = 0 ; j < n ; ++j) {
                grid[i][j] = r.nextInt(2);
            }
        }

        for(int i = 0 ; i < n ; ++i) {
            for(int j = 0 ; j < n ; ++j) {
                color[i][j] = 0;
            }
        }
    }



    public void searchForOne(){
        System.out.println("cluster" + "\t " + "size" + "\t" + "location");

        for(int i = 0 ; i < n ; ++i) {
            for (int j = 0 ; j < n ; ++j){
                if(grid[i][j] == 1 && color[i][j] == 0){
                    ++clusters;
                    dfs(i,j);
                    System.out.println(clusters + "\t\t " + size + "\t\t" + "(" + (i+1) + "," + (j+1) + ")");
                    size = 0;
                }
                color[i][j] = 1;
            }
        }
    }

    public void dfs(int i, int j) {
        color[i][j] = 1;
        ++size;
        if(j < n - 1) if(grid[i][j + 1] == 1 && color[i][j + 1] == 0) dfs(i, j + 1);
        if(i < n - 1) if(grid[i + 1][j] == 1 && color[i + 1][j] == 0) dfs(i + 1, j);
        if(j > 0) if(grid[i][j - 1] == 1 && color[i][j - 1] == 0) dfs(i, j - 1);
        if(i > 0) if(grid[i - 1][j] == 1 && color[i - 1][j] == 0) dfs(i - 1, j);
    }


    public void printGrid() {
        for (int[] row : grid) {
            for (int col : row)
                System.out.print(col + " ");
            System.out.println();
        }
    }

    public void printVisitStatus() {
        for (int[] row : color) {
            for (int col : row)
                System.out.print(col + " ");
            System.out.println();
        }
    }
}

