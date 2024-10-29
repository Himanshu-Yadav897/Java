public class SearchSorted {
    public static int ModifiedBinarySearch(int arr[] , int target, int si, int ei){
        if(si > ei){
            return -1;
        }

        int mid = si + (ei - si)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[si] <= arr[mid]){
            if(arr[si] <= target && target <= arr[mid]){
                return ModifiedBinarySearch(arr, target, si, mid-1);
            }else{
                return ModifiedBinarySearch(arr, target, mid+1, ei);
            }
        }else{
            if(arr[mid] <= target && target <= arr[ei]){
                return ModifiedBinarySearch(arr, target, mid+1, ei);
            }else{
                return ModifiedBinarySearch(arr, target, si, mid-1);
            }
        }
    }
 
    public static void main(String[] args) {
        int arr[] = { 7,8,9,0,1,2,3,4,5,6};
        int target = 3;
        int Idx = ModifiedBinarySearch(arr, target, 0, arr.length-1);
        System.out.println(Idx);

    }
}
