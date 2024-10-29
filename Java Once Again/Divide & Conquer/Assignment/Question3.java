// Inversion Count
public class Question3 {
    public static int mergeSort1(int arr[], int si, int ei) {
        if (si >= ei) {
            return 0;
        }

        int mid = si + (ei - si) / 2;
        int ans = 0;
       ans +=  mergeSort1(arr, si, mid);
        ans += mergeSort1(arr, mid + 1, ei);

       ans +=  merge(arr, si, mid, ei);

       return ans;
    }

    public static int merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];

        int i = si;
        int j = mid + 1;
        int k = 0;

        int count = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                count += mid-i + 1;
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        // for left over elements
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for(k = 0 , i = si; k<temp.length;k++, i++){
            arr[i] = temp[k];
        }

        return count;
        
    }

    public static void main(String[] args) {
        int arr[] = {2,6,4,1,3,5};
        int result = mergeSort1(arr, 0, arr.length-1);
        System.out.println(result);
    }
}
