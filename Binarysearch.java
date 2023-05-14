class Binarysearch{
    static int Binarysearch(int[] arr,int target){// iterative approach here we divide the array until the mid element is = target element and return the mid value as its index 
       int start =0;
       int end = arr.length -1;
       while(start<=end){
        int mid = start+(end-start)/2 ;
        if (target < arr[mid])
        end = mid-1;
        else if(target>arr[mid])
        start = mid+1;
        else{
            return mid;
        }



       }
    
// no elent is present 
        return -1;
    }
    public static void main(String[] args) {
        int arr []= {2,4,6,7,8,9};
        int target = 7;
        int ans = Binarysearch(arr, target);
        System.out.println(ans);
        
        
    }
}