public class ReverseArray {


    public static void printArray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void revArray(int [] arr) {
        int start = 0, end = arr.length-1, temp;
        while (start<=end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Before Reverse");
        printArray(arr);
        revArray(arr);
        System.out.println("After Reverse");
        printArray(arr);
    }
}
