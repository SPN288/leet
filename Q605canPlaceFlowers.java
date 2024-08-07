
public class Q605canPlaceFlowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 0 && n > 0) {
            return false;
        }
        if(flowerbed.length==1&&flowerbed[0]==0){
            return true;
        }
        else if(flowerbed.length==1&&(flowerbed[0]==1&&n>0)){
            return false;
        }
        
        for (int i = 0; i < flowerbed.length; i++) {
            if (i == 0 && (flowerbed[i] == 0 && flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                n--;
                continue;
            }
            if (i == (flowerbed.length-1) && (flowerbed[i] == 0 && flowerbed[i - 1] == 0)) {
                flowerbed[i] = 1;
                n--;
                continue;
            }
            
            if (flowerbed[i] == 0 && (flowerbed[i - 1] != 1 && flowerbed[i + 1] != 1)) {
                flowerbed[i] = 1;
                n--;
            }
        }
        
        if (n <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 0, 1, 0, 0};
        int[] arr1 = {1, 0, 0, 0, 0, 1};
        System.out.println(canPlaceFlowers(arr, 2));

        System.out.println(canPlaceFlowers(arr, 2));
        System.out.println(canPlaceFlowers(arr1, 2));
    }
}
