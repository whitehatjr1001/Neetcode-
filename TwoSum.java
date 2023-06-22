import java.util.*;
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> Sum = new HashMap<>();

        for (int i =0;i<=nums.length;i++){
            int num = nums[i];
            int diff = target - num;
            if(Sum.containsKey(diff)){
                return new int [] {Sum.get(diff),i};

            }
            Sum.put(num, i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int nums [] = {2,4,5,6};
       System.out.print( twoSum(nums,8));

        
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(target-nums[i]) && map.get(target-nums[i])>i)
            {
                result[0]=i;
                result[1]=map.get(target-nums[i]);
                break;
            }
        }
        return result;
        
    }
}