
public class Q1937MaximumNumberOfPointswithCost {
    // public static long maxPoints(int[][] points) {
    //     int score=0;
    //     int cl=0;
    //     int tominus=0;
    //     int max=Integer.MIN_VALUE;
    //     for (int j = 0; j < points[0].length; j++) {
    //         if(points[0][j]>max){
    //             max=points[0][j];

    //             cl=j;
    //         }
    //     }
    //     score+=max;
    //     for (int i = 1; i < points.length; i++) {
    //          max=Integer.MIN_VALUE;
    //         for (int j = 0; j < points[0].length; j++) {
    //             if(points[i][j]>max){
    //                 max=points[i][j];
    //                 tominus+=cl-j;
    //                 cl=j;
    //             }
    //         }
    //         score+=max;
    //     }
    //     return score-tominus;
    // }
    public static long maxPoints(int[][] points) {
        int r = points.length;
        int c = points[0].length;
        int maxi;
        int max;
        int i;
        if (points.length == 1) {
            max = Integer.MIN_VALUE;
            for (i = 0; i < c; i++) {
                if (max < points[0][i]) {
                    max = points[0][i];
                }
            }
            return max;
        }
        int[][] ans = new int[r][c];
        for (i = 0; i < c; i++) {
            ans[0][i] = points[0][i];
        }

        for (i = 1; i < r; i++) {
            maxi = 0;
            max = Integer.MIN_VALUE;
            for (int j = 0; j < c; j++) {
                if (ans[i - 1][j] >= max) {
                    max = ans[i - 1][j];
                    maxi = j;
                }
            }
            for (int j = 0; j < c; j++) {
                ans[i][j] = points[i][j] + max - Math.abs(maxi - j);
            }
        }

        for (i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
        max = Integer.MIN_VALUE;
        for (i = 0; i < c; i++) {
            if (max < ans[r - 1][i]) {
                max = ans[r - 1][i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {1, 5, 1}, {3, 1, 1}};
        int[][] arr2 = {{2, 4, 0, 5, 5}, {0, 5, 4, 2, 5}, {2, 0, 2, 3, 1}, {3, 0, 5, 5, 2}};
        System.out.println(maxPoints(arr2));

    }
}
