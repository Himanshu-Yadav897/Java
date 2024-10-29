public class hello {
    public static void main(String[] args) {
    int x = 7;
    // int arr[] = {2,4,6,8,10,6,6,8,9,10,6,6,8,9,7};
    int arr[] = {4,6,3,5,8,2};
    int count = 0;
    for(int i = 0; i<arr.length; i++){
        for(int j = i+ 1; j<arr.length; j++){
            if(arr[i] + arr[j] == x){
                count++;
            }
        }
    }
  
    

    System.out.println(count);
   
    }
}
