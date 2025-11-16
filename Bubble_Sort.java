public class Bubble_Sort {

    public static void bubbleSort(int arr[]){
//        int swap = 0;
        for (int i = 0; i<arr.length-1; i++){
            for (int j = 0; j<arr.length-1-i; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
//                    swap++;
                }
            }
        }
//        System.out.println(swap);
        printArr(arr);
    }

    public static void printArr(int arr[]){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {4 , 3 , 6 , 7 , 2 , 1};
//        int arr[] = {1, 2, 3, 4, 5, };
        bubbleSort(arr);
    }
}
