public class Subarray1 {

    public static void printSubarrays(int [] nums){
        int total_subarray = 0;
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(nums[k]+ " ");

                }
                total_subarray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub-array " +total_subarray);
    }
    public static void main(String[] args) {
        //Sub-array = A continuous part of a array.
        int [] num = {2,4,6,8,10};
        printSubarrays(num);
    }
}
