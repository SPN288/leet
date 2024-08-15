import java.util.*;
public class Q443StringCompression {
    
    public static int compress(char[] chars) {
        if(chars.length==1){
            return 1;
        }
        ArrayList<Character> ll=new ArrayList<>();
        int count=1;
        int i;
        for ( i = 1; i < chars.length; i++) {
            
            if(chars[i]==chars[i-1]){
                count++;
            }else{
                if(count==1){
                    ll.add(chars[i-1]);
                }
                else if(count<10){
                    ll.add(chars[i-1]);
                    String p=String.valueOf(count);
                    ll.add(p.charAt(0));
                    count=1;
                }
                else if(count>=10){
                    ll.add(chars[i-1]);
                    String s=String.valueOf(count);
                    for (int j = 0; j < s.length(); j++) {
                        ll.add(s.charAt(j));
                    }
                    count=1;
                }
            }
            if(i==chars.length-1){
                ll.add(chars[i]);
                if(count>1){
                    String s=String.valueOf(count);
                    for (int j = 0; j < s.length(); j++) {
                        ll.add(s.charAt(j));
                    }
                }
            }
            
        }
        for ( i = 0; i < ll.size(); i++) {
            chars[i]=ll.get(i);
        }
        //System.out.println(ll);


        return ll.size();

    }
    public static void main(String[] args) {
        //  char[] arr={'x','a','a','a','a','a','a','a','b','b','b','b','b','b','b','b','b','b','z','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','c','c','y','y'};
        //  System.out.println(compress(arr));
         char[] arr2={'a','b'};
         System.out.println(compress(arr2));
        
    }
}
