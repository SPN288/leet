
public class Q48rotatematrix {

    public static  void rotate(int[][] matrix) {
        int a = matrix[0].length;
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = i; j < matrix[0].length - i - 1; j++) {

                int next, p = i, q = j;
                int curr = matrix[i][j];

                for (int k = 1; k <= 4; k++) {
                    next = matrix[q][a - 1 - p];
                    matrix[q][a - 1 - p] = curr;
                    curr = next;
                    int x = p;
                    p = q;
                    q = a - 1 - x;

                }

            }

        }
    }

    static void printer(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "   ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        printer(matrix);
        rotate(matrix);
        System.out.println();
        printer(matrix);
        
    }
}
