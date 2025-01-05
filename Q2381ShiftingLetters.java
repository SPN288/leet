public class Q2381ShiftingLetters {

    public static StringBuilder shift(StringBuilder s,int st,int ed,int d){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < st; i++) {
            sb.append(s.charAt(i));
        }
        for (int i = st; i <=ed; i++) {
            char x=s.charAt(i);
            if(d==0){
                if(x=='a'){
                    sb.append('z');
                }else{
                    x--;
                    sb.append(x);
                }
            }else{
                if(x=='z'){
                    sb.append('a');
                }else{
                    x++;
                    sb.append(x);
                }
            }
        }
        for (int i = ed+1; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }

        return sb;
    }
    
    public static String shiftingLetters(String s, int[][] shifts) {
        StringBuilder sb=new StringBuilder(s);

        for (int i = 0; i < shifts.length; i++) {
            sb=shift(sb, shifts[i][0], shifts[i][1], shifts[i][2]);
            System.out.println(sb);
        }

        return sb.toString();
    }




    public static void main(String[] args) {
        String s="abc";
        int[][] shifts={{0,1,0},{1,2,1},{0,2,1}};
        System.out.println(shiftingLetters(s, shifts));
    }
}
