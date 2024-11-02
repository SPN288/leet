
import java.util.Stack;

public class Q735AstroidCollision {

    public static  int[] asteroidCollision(int[] asteroids) {
    
        Stack<Integer> ans=new Stack();
        ans.push(asteroids[0]);
        int i=1;
        while (i < asteroids.length) {
            if(ans.isEmpty()){
                ans.push(asteroids[i]);
                i++;
                continue;
            }
            int c = ans.peek(), x = asteroids[i];
            if (c > 0 && x < 0) {
                if (Math.abs(c) > Math.abs(x)) {
                    i++;
                    continue;
                } else if (Math.abs(c) == Math.abs(x)) {
                    ans.pop();
                    i++;
                }
                else {
                    ans.pop();
                    if (ans.isEmpty()) {
                        ans.push(x);
                        i++;
                    }
                }
            } else{ ans.push(x);
            i++;}
        }
    int[] res=new int[ans.size()];
    for(i=ans.size()-1;i>=0;i--){
        res[i]=ans.pop();
    }
    return res;
    }

    public static void main(String[] args) {
        int [] asteroids = {1,-1,-2,-2};
        asteroidCollision(asteroids);
    }
}
