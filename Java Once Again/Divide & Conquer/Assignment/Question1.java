// Apply MergeSort to sort on array of Strings. (asssume that
// all the charracters in all the strings are in lowercase).
// Sample Input : arr = { "sum","earth", "mars", "mercury"};
// Sample Output : arr = { "earth", "mars", "mercury", "sum"};


public class Question1 {

    public static void MergeSort(String arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        MergeSort(arr, si, mid);
        MergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);

    }

    public static void merge(String arr[], int si, int mid, int ei) {
        String temp[] = new String[ei - si + 1];

        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (smaller(arr[i], arr[j]) == true) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while (j <= ei) {
            temp[k] = arr[j];
            k++;
            j++;
        }

        for(int idx = si; idx <= ei;idx++ ){
            arr[idx] = temp[idx - si];
        }
    }

    public static boolean smaller(String a, String b) {
        for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
            if (a.charAt(i) < b.charAt(i)) {
                return true;
            } else if (a.charAt(i) > b.charAt(i)) {
                return false;
            }
        }

        if (a.length() < b.length()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String arr[] = { "sum", "earth", "mars", "mercury" };
        MergeSort(arr, 0, arr.length-1);
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
