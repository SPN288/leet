public class Q605canPlaceFlowers {
    public static  boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length==0&&n>0){return false;}
        if(flowerbed.length==1){
            if(flowerbed[0]==0&&n==1){return true;}
        }
        int i=0;
        if(flowerbed[0]==0&&flowerbed[1]==1){
            i=1;
        }
        for (; i < flowerbed.length; i=i+2) {
            if(flowerbed[i]==0){
            if(i!=flowerbed.length-1&& flowerbed[i+1]==0){
                n--;
            }
            if(i==flowerbed.length-1){
                n--;
            }   
            }
        }
        if(n<=0){return true;}

        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,0,0,0,1,0,0};
        int[] arr1={1,0,0,0,0,1};
        System.out.println(canPlaceFlowers(arr, 2));
        
        System.out.println(canPlaceFlowers(arr, 2));
        System.out.println(canPlaceFlowers(arr1, 2));
    }
}
