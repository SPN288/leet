
public class Q860Lemonadechange {

    public static boolean lemonadeChange(int[] bills) {

        int five = 0, ten = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                five++;
                continue;
            }
            if (bills[i] == 10) {
                if (five > 0) {
                    ten++;
                    five--;
                    continue;
                } else {
                    return false;
                }
            }
            if (bills[i] == 20) {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                    
                } else if(five>=3){
                    five-=3;
                    
                }else{return false;}
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] bills = {5,5,10,20,5,5,5,5,5,5,5,5,5,10,5,5,20,5,20,5};
        int[] bills2 = {5, 5, 10, 10, 20};
        System.out.println(lemonadeChange(bills));
        System.out.println(lemonadeChange(bills2));
    }
}
