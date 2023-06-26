import java.util.HashSet;

public class LongestConsecutiveSequence{
    public static int longestseq(int[] nums){
        int max = 1;
        HashSet<Integer> set = new HashSet<>();
        for(int num :nums)set.add(num);
        for(int num:nums){
            if(!set.contains(num-1)){
                int count =1;
                while(set.contains(num+1)){
                    num++;
                    count++;
                }
                return max = Math.max(count,max);
            }
        }
        return max;
        

    }
    public static void main(String[] args) {
        int [] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestseq(nums));

        
    }
}
