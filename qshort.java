


public class qshort {

    static int partation(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        arr[high] = arr[i];
        arr[i] = pivot;

        return i;
    }

    static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pindex = partation(arr, low, high);
            quicksort(arr, low, pindex - 1);
            quicksort(arr, pindex + 1, high);
        }
    }

    static void printer(int[] arr){
        for (int num :arr) {
            System.out.print(num+" ");
        }
        System.out.println();
    }
    static void reverse(int[] arr){
        int l=arr.length;
        for (int i = 0; i < l/2; i++) {
            int temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
        }
    }

    // static int paart(int[] arr, int low, int high) {
    //     int piviot = arr[high];
    //     int i = low - 1;
    //     for (int j = low; j < high; j++) {
    //         if (arr[j] < piviot) {
    //             i++;
    //             int temp = arr[j];
    //             arr[j] = arr[i];
    //             arr[i] = temp;

    //         }
    //     }
    //     i++;
    //     arr[high] = arr[i];
    //     arr[i] = piviot;
    //     return i;
    // }

    // static void sorter(int[] arr, int low, int high) {
    //     if(low<high){int pindex = paart(arr, low, high);

    //     sorter(arr, low, pindex - 1);
    //     sorter(arr, pindex + 1, high);}
    // }

    public static void main(String[] args) {
        int arr[] = {7, 2, 4, 3, 6, 9, 1};
        quicksort(arr, 0, arr.length - 1);
        printer(arr);
        reverse(arr);
         
        // Arrays.sort(arr);
        printer(arr);

    }

}
