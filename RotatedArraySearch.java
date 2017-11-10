public class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int low = 0;
        int high = len -1;
        
        while(low <= high){
            int mid = (low + high)/2;
            
            if(nums[mid] == target){
                return mid;
            }
            
            // see which part is sorted and check the number lie in this and change low and high accordingly
            if(nums[mid] <= nums[high]){
                if(target <= nums[high] && target > nums[mid]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
            else{
                if(target < nums[mid] && target >= nums[low]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
        }

        
        return -1;
    }
}
