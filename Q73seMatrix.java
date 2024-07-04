public class Q73seMatrix {
    static void printerm(int mat[][]){
        for (int i = 0; i < mat.length; i++) {
            for (int idx = 0; idx < mat[0].length; idx++) {
                System.out.print(" "+mat[i][idx]);
            }System.out.println();
        }
    }

    public static void setZeroes(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        int mat[][]=new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j]==0){mat[i][j]=11;}
            }
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(mat[i][j]==11){
                    for (int k = 0; k < n; k++) {
                        matrix[i][k]=0;
                    }
                    for (int k = 0; k < m; k++) {
                        matrix[k][j]=0;
                    }
                }
            }
        }
    }



    public static void main(String[] args) {
        int mat[][]={{1,1,1},{1,0,1},{1,1,1}};
        printerm(mat);
        setZeroes(mat);
        printerm(mat);
    }
}
