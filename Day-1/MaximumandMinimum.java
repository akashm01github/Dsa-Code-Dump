public class MaximumandMinimum {
    public static int minimum(int [] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int maximum(int [] arr){
        int max =  Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void printArray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
            int [] arr = {32, 34, 67, 90, 128};
            printArray(arr);
            System.out.println("The Minimum Number is: " + minimum(arr));

            System.out.println("The Maximum Number is : " + maximum(arr));


    }
}
