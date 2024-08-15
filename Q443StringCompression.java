public class Q443StringCompression {
    
    // public static int compress(char[] chars) {
    //     if(l==1){
    //         return 1;
    //     }
    //     ArrayList<Character> ll=new ArrayList<>();
    //     int count=1;
    //     int i;
    //     for ( i = 1; i < l; i++) {
            
    //         if(chars[i]==chars[i-1]){
    //             count++;
    //         }else{
    //             if(count==1){
    //                 ll.add(chars[i-1]);
    //             }
    //             else if(count<10){
    //                 ll.add(chars[i-1]);
    //                 String p=String.valueOf(count);
    //                 ll.add(p.charAt(0));
    //                 count=1;
    //             }
    //             else if(count>=10){
    //                 ll.add(chars[i-1]);
    //                 String s=String.valueOf(count);
    //                 for (int j = 0; j < s.length(); j++) {
    //                     ll.add(s.charAt(j));
    //                 }
    //                 count=1;
    //             }
    //         }
    //         if(i==l-1){
    //             ll.add(chars[i]);
    //             if(count>1){
    //                 String s=String.valueOf(count);
    //                 for (int j = 0; j < s.length(); j++) {
    //                     ll.add(s.charAt(j));
    //                 }
    //             }
    //         }
            
    //     }
    //     for ( i = 0; i < ll.size(); i++) {
    //         chars[i]=ll.get(i);
    //     }
        //System.out.println(ll);
        public static int compress(char[] chars) {
            int l=chars.length;
            if(l==1){
                return 1;
            }
            int ans=0;
            int count=1;
            int i;
            for ( i = 1; i < l; i++) {
                
                if(chars[i]==chars[i-1]){
                    count++;
                }else{
                    if(count==1){
                        chars[ans]=(chars[i-1]);
                        ans++;
                    }
                    else if(count<10){
                        chars[ans]=(chars[i-1]);
                        ans++;
                        String p=String.valueOf(count);
                        chars[ans]=(p.charAt(0));
                        
                        ans++;
                        count=1;
                    }
                    else if(count>=10){
                        chars[ans]=(chars[i-1]);
                        ans++;
                        String s=String.valueOf(count);
                        for (int j = 0; j < s.length(); j++) {
                            chars[ans]=(s.charAt(j));
                            ans++;
                        }
                        count=1;
                    }
                }
                if(i==l-1){
                    chars[ans]=(chars[i]);
                        ans++;
                    if(count>1){
                        String s=String.valueOf(count);
                        for (int j = 0; j < s.length(); j++) {
                            chars[ans]=(s.charAt(j));
                            ans++;
                        }
                    }
                }
                
            }
            


        return ans;

    }
    public static void main(String[] args) {
        // char[] arr={'x','a','a','a','a','a','a','a','b','b','b','b','b','b','b','b','b','b','z','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','c','c','y','y'};
        // System.out.println(compress(arr));
        //  char[] arr2={'a','b'};
        //  System.out.println(compress(arr2));
        int x=10;
        char y=(char)(x+'0');
        System.out.println(y);
        
    }
}
