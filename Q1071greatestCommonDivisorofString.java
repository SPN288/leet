
public class Q1071greatestCommonDivisorofString {

    public static String gcdOfStrings(String str1, String str2) {

        if (str1.length() == 0 || str2.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (str1.length() == 1 || str2.length() == 1 && str1.charAt(0) == str2.charAt(0)) {
            sb.append(str1.charAt(0));
            return sb.toString();
        }

        if (str1.charAt(0) != str2.charAt(0)) {
            return sb.toString();
        }
        int i = 1;
        sb.append(str1.charAt(0));
        while (i < str1.length()) {

            if (str1.charAt(i) == sb.charAt(0) && str1.charAt(i + 1) == sb.charAt(1)) {
                //return sb.toString();
                break;
            } else {
                sb.append(str1.charAt(i));
            }
            i++;

        }
        for (int j = 0; j < sb.length(); j++) {
            if((sb.length()+j)<str1.length()&& sb.charAt(j)==str1.charAt(sb.length()+j)){
                
            }else{return "";}
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("abcabcabc", "abc"));
        System.out.println(gcdOfStrings("abababab", "abab"));
        System.out.println(gcdOfStrings("leet", "code"));
    }
}
