public class Q1004MaxConsecutiveOnes {
    public static void main(String[] args) {
        int input1 = 2; // Number of different paints on the palette
        int input2 = 1; // Maximum number of paints to be used in a combination

        int result = numberOfPaints(input1, input2);
        System.out.println("Number of different paint combinations: " + result);
    }

    public static int numberOfPaints(int input1, int input2) {
        int totalCombinations = 0;

        for (int i = 1; i <= input2; i++) {
            totalCombinations += combination(input1, i);
        }

        return totalCombinations;
    }

    public static int combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
