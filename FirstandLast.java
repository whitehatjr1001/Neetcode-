import java.util.Arrays;

public class FirstandLast {
    public static void main(String[] args) {
        int [] nums = {1,4,5,7,7,8,9};
        int target = 7;
        int[] ans = search(nums, target);
        System.out.println(Arrays.toString(ans));
        
    }
    static int[] search(int[]nums,int target){
        int[] ans = {-1,-1};
        ans[0]= searchRange( nums,target,true);
        if(ans[0]!=-1){
            ans[1]=searchRange( nums,target,false);
        }
        return ans;
    }
    static int searchRange(int[] nums, int target,boolean index) {
       int ans = -1;
        int start =0;
        int end = nums.length -1;
        while (start<=end){
            int mid = start+(end -start)/2;
            if(target>nums[mid]){
                start = mid +1;

            }
            else if(target<nums[mid]){
                end = mid -1;
            }
            else {
                //ans 
                ans = mid;
                if(index){
                    end=mid-1;
                }else {
                    start = mid+1;
                }
            }
        }

return ans;
        
    
}
}

