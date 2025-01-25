import java.util.HashMap;
import java.util.HashSet;

public class Q209WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        String [] a= s.split(" ");
        //System.out.println(a[3]);
        if(pattern.length()!=a.length){
            return false;
        }
        HashMap<Character,String>hm=new HashMap<>();
        HashSet<Character> h1=new HashSet<>();
        HashSet<String> h2=new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            hm.put(pattern.charAt(i), a[i]);
            h1.add(pattern.charAt(i));
            h2.add(a[i]);
        }
        //System.out.println(h1+ " "+h2);
        String k="";
        for (int i = 0; i < a.length-1; i++) {
            k+=hm.get(pattern.charAt(i));
            k+=" ";
        }
        k+=hm.get(pattern.charAt(a.length-1));
        //System.out.println(k);



        return (s.equals(k) && (h1.size()==h2.size()));
    }
    public static void main(String[] args) {
        String pattern = "abba", s = "dog dog dog dog";
        System.out.println(wordPattern(pattern, s));
    }
}
