public class Q1004MaxConsecutiveOnes {
    public static void main(String[] args) {
        int input1 = 2; // Number of different paints on the palette
        int input2 = 1; // Maximum number of paints to be used in a combination

        int result = numberOfPaints(input1, input2);
        System.out.println("Number of different paint combinations: " + result);
    }

    // public static int numberOfPaints(int input1, int input2) {
    //     int totalCombinations = 0;

    //     for (int i = 1; i <= input2; i++) {
    //         totalCombinations += combination(input1, i);
    //     }

    //     return totalCombinations;
    // }

    // public static int combination(int n, int r) {
    //     return factorial(n) / (factorial(r) * factorial(n - r));
    // }

    // public static int factorial(int n) {
    //     if (n == 0 || n == 1) {
    //         return 1;
    //     }
    //     return n * factorial(n - 1);
    // }

    public static int numberOfPaints(int input1, int input2) {
        if (input2 == 0 || input1 == 0) {
            return 0; 
        }
        if (input2 > input1) {
            input2 = input1; 
        }

        int totalCombinations = 0;

        
        int[] comb = new int[input2 + 1];
        comb[0] = 1; 

        for (int i = 1; i <= input1; i++) {
            for (int j = Math.min(i, input2); j > 0; j--) {
                comb[j] += comb[j - 1];
            }
        }

        
        for (int i = 1; i <= input2; i++) {
            totalCombinations += comb[i];
        }

        return totalCombinations;
    }

    public static int combination(int n, int r) {
        if (r > n - r) {
            r = n - r; // Since C(n, r) = C(n, n-r), reduce the number of iterations
        }
        int result = 1;
        for (int i = 0; i < r; i++) {
            result *= (n - i);
            result /= (i + 1);
        }
        return result;
    }
}
