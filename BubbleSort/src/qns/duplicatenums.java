package qns;
public class duplicatenums {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] nums) {
        int i =0;
        while(i<nums.length){
            int an = nums[i] - 1;
            if(nums[i] != nums[an]){
                int t = nums[i];
                nums[i] = nums[an];
                nums[an] = t;
            }else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
                return j;
            }
        }
        return nums.length;
    }
}
