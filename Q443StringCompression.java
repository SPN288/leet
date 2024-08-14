import java.util.*;
public class Q443StringCompression {
    // public static int compress(char[] chars) {
    //     ArrayList<Character> ll=new ArrayList<>();
    //     int count=1;

    //     for (int i = 0; i < chars.length-1; i++) {
            
    //         if(chars[i]==chars[i+1]){
    //             if(count==1){
    //                 ll.add(chars[i]);
    //                 count=0;
    //             }
    //             else if(count<10){
    //                 ll.add((char)count);
    //                 count=0;
    //             }
    //             else if(count>=10){
    //                 String s=String.valueOf(count);
    //                 for (int j = 0; j < s.length(); j++) {
    //                     ll.add(s.charAt(j));
    //                 }
    //                 count=0;
    //             }
    //         }
    //     }
    //     System.out.println(ll);


    //     return ll.size();

    // }
    public static int compress(char[] chars) {
        ArrayList<Character> ll=new ArrayList<>();
        int count=1;

        for (int i = 0; i < chars.length-1; i++) {
            
            if(chars[i]==chars[i+1]){
                count++;
            }else{
                if(count==1){
                    ll.add(chars[i]);
                }
                else if(count<10){
                    ll.add(chars[i]);
                    ll.add((char)count);
                    count=1;
                }
                else if(count>=10){
                    ll.add(chars[i]);
                    String s=String.valueOf(count);
                    for (int j = 0; j < s.length(); j++) {
                        ll.add(s.charAt(j));
                    }
                    count=1;
                }
            }
            if(i==chars.length-1){
                if(count<10){
                    ll.add(chars[i]);
                    ll.add((char)count);
                    count=1;
                }
                else if(count>=10){
                    ll.add(chars[i]);
                    String s=String.valueOf(count);
                    for (int j = 0; j < s.length(); j++) {
                        ll.add(s.charAt(j));
                    }
                    count=1;
                }
            }
        }
        System.out.println(ll);


        return ll.size();

    }
    public static void main(String[] args) {
        char[] arr={'a','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','c','c'};
        System.out.println(compress(arr));
    }
}
