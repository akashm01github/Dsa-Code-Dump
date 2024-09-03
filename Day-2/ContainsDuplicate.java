public class ContainsDuplicate {

    public static boolean containsDupli(int[] nums) {

        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int [] numms = {1,2,3,4};
        System.out.println(containsDupli(numms));




    }
}
