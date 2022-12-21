
//選擇排序法
public class SelectionSort {
    public static void selectionSort(int[] arr){
        int minIndex;
        for (int i = 0; i< arr.length; i++){  //由小到大
            minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] <arr[minIndex])
                    minIndex = j;
            }
            int temp = arr[i];        //
            arr[i] = arr[minIndex];  //兩數交換
            arr[minIndex] = temp;   //
        }
    }
    public static void main(String[] args) {
        int [] array = {9,8,6,4,3,7};
        System.out.println("Original array: ");
        for (int i :array){
            System.out.print(i + " ");
        }
        System.out.println();
        selectionSort(array);
        System.out.println("After sort: ");
        for (int i : array){
            System.out.print(i + " ");
        }
    }
}
