/**
 * Created by Nosh on 7/18/2017.
 */
import java.util.Stack;

public class LCS {
    public int [][] value;
    public int [][] track;
    public Stack<String> s;
    public int m, n;
    /*For tracking
     * 0 stands for none
     * 1 stands for left
     * 2 stands for up
     * 3 stands for diagonal
     */
    public LCS(String a, String b) {
        m = a.length();
        n = b.length();
        value = new int[m + 1][n + 1];
        track = new int[m + 1][n + 1];

        //intialization part
        for(int i = 0; i <= m; ++i) {
            value[i][0] = 0;
            track[i][0] = 1;
        }
        for(int j = 0; j <= n; ++j) {
            value[0][j] = 0;
            track[0][j] = 1;
        }

        //Tracking and updating the values
        for(int i = 1 ; i <= m ; i++) {
            for(int j = 1 ; j <= n ; j++) {
                if(a.charAt(i - 1) == b.charAt(j - 1)) {
                    value[i][j] = value[i - 1][j - 1] + 1;
                    track[i][j] = 3;
                }

                if( value[i - 1][j] >= value[i][j] ) {
                    value[i][j] = value[i - 1][j];
                    track[i][j] = 1;
                }

                if( value[i][j - 1] >= value[i][j] ) {
                    value[i][j] = value[i][j - 1];
                    track[i][j] = 2;
                }
            }
        }

        //Backtracking and stacking
        s = new Stack<String>();
        int i = m;
        int j = n;
        while(i > 0 || j > 0) {
            if(track[i][j] == 3) {
                s.push("" + a.charAt(i - 1));
                --i;
                --j;
            }

            else if(track[i][j] == 1) --i;
            else if(track[i][j] == 2) --j;
        }

        while (!s.empty()) {
            System.out.print(s.pop());
        }
        System.out.println();
    }

    //Methods for debugging
    public void printValues() {
        for(int[] x : value) {
            for (int y : x) System.out.print(y + " ");
            System.out.println();
        }
    }

    public void printTrack() {
        for(int[] x : track) {
            for (int y : x) System.out.print(y + " ");
            System.out.println();
        }
    }
}
