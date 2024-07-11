public class Q12integertoroman {
    public static String intToRoman(int num) {
        final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] symbols = {"M",  "CM", "D",  "CD", "C",  "XC", "L",
                                  "XL", "X",  "IX", "V",  "IV", "I"};
        StringBuilder sb = new StringBuilder();
    
        for (int i = 0; i < values.length; ++i) {
          if (num == 0)
            break;
          while (num >= values[i]) {
            num -= values[i];
            sb.append(symbols[i]);
          }
        }
    
        return sb.toString();
      }


      public static void main(String[] args) {
          System.out.println(intToRoman(100));
          System.out.println(intToRoman(3749));
          System.out.println(intToRoman(58));
      }
      
}
