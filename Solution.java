class Solution {
    public int[] twoSum(int[] nums, int target) {
        int p = 0;
        int[] array ={0,0};
        for (int i = 0; p < nums.length || i < nums.length; i++){
            if (nums[p] + nums[i] == target) {
                array[0]=p;
                System.out.println(p);
                array[1]=i;
                return array;
            }
            else if (nums[p] + nums[i] != target && i == nums.length){
                i = 0;
                p++;
                System.out.println("no sum");
            }
            else {
                System.out.println("error");
            }
                
        } return array;
    } 
   
}