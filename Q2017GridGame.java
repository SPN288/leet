
public class Q2017GridGame {
    static void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] prefix(int[][] a) {
        int[][] h = new int[2][a[0].length];

        h[0][a[0].length - 1] = a[0][a[0].length - 1];
        h[1][a[0].length - 1] = 0;

        for (int i = 1; i >= 0; i--) {
            for (int j = a[0].length - 2; j >= 0; j--) {
                h[i][j] = a[i][j] + h[i][j + 1];
            }
        }
        //print(h);
        return h;
    }

    public static int nav(int[][] a, int[][] h) {
        int score = a[0][0];
        a[0][0] = 0;
        int i = 0;
        for (int j = 0; j < a[0].length; j++) {
            if (i == 1) {
                score += a[i][j];
                a[i][j] = 0;
                continue;
            }
            if (i == 0 && j == a[0].length - 1) {
                score += a[1][a[0].length - 1];
                a[1][a[0].length - 1] = 0;
                continue;
            }
            if (h[i][j + 1] < h[i + 1][j]) {
                i++;
                score += a[i][j];
                a[i][j] = 0;
            } else {
                score += a[i][j + 1];
                a[i][j + 1] = 0;
            }
        }

        return score;
    }



    public static long gridGame(int[][] grid) {
        
        int[][] h = prefix(grid);
        int score = nav(grid, h);
        h = prefix(grid);
        score = nav(grid, h);

        return score;
    }

    public static void main(String[] args) {
        int[][] grid = {{20,3,20,17,2,12,15,17,4,15},
                        {20,10,13,14,15,5,2,3,14,3}};
        System.out.println(gridGame(grid));
    }
}
