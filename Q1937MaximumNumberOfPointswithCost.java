public class Q1937MaximumNumberOfPointswithCost {
    public static long maxPoints(int[][] points) {
        int score=0;
        int cl=0;
        int tominus=0;
        int max=Integer.MIN_VALUE;
        for (int j = 0; j < points[0].length; j++) {
            if(points[0][j]>max){
                max=points[0][j];
    
                cl=j;
            }
        }
        score+=max;
        //System.out.println(cl);

        for (int i = 1; i < points.length; i++) {
             max=Integer.MIN_VALUE;
            for (int j = 0; j < points[0].length; j++) {
                if(points[i][j]>max){
                    max=points[i][j];
                    tominus+=cl-j;
                    cl=j;
                }
            }
            score+=max;
            //System.out.println(cl);
        }
        //System.out.println(tominus);

        return score-tominus;
    }

    public static void main(String[] args) {
        int[][] arr={{1,2,3},{1,5,1},{3,1,1}};
        System.out.println(maxPoints(arr));

    }
}
