public class Containerwithmostwater {
    public static int maxArea(int[] height) {
        int l=0 , r=height.length-1 ;
        int res=0 ;
        while(l!=r){
            int area=Math.min(height[l],height[r])*(r-l);// are [= l*b her breeath is lenth bw pointers ]
            res = Math.max(res,area);
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
           
        }
         return res;
    }
    public static void main(String[] args) {
        int [] height = {7,8,5,6,7,9,1};
        System.out.println(maxArea(height));
    }
    
}
