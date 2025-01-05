public class Q2381ShiftingLetters {

    
    
    public static String shiftingLetters(String s, int[][] shifts) {
        StringBuilder sb=new StringBuilder(s);
        
        for (int i = 0; i < shifts.length; i++) {
            for (int j = shifts[i][0]; j <=shifts[i][1]; j++) {
                char x=sb.charAt(j);
                if(shifts[i][2]==0){
                    if(x=='a'){
                        
                        sb.setCharAt(j, 'z');
                    }else{
                        x--;
                        
                        sb.setCharAt(j, x);
                    }
                }else{
                    if(x=='z'){
                        
                        sb.setCharAt(j, 'a');
                    }else{
                        x++;
                        
                        sb.setCharAt(j, x);
                    }
                }
            }
            //System.out.println(sb);
        }

        return sb.toString();
    }




    public static void main(String[] args) {
        String s="abc";
        int[][] shifts={{0,1,0},{1,2,1},{0,2,1}};
        System.out.println(shiftingLetters(s, shifts));
    }
}
