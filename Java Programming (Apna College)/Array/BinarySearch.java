public class BinarySearch {
    public static int Search(int number[] , int key){
        int start = 0 , end = number.length - 1;
        while(start <= end){
            int mid = (start + end) /2;
            if(number[mid] == key){
                return mid;
            }
            else if(number[mid]<key){
                start = mid +1;
            }
            else{
                end = mid -1;                  
            }

        }
        return -1;
    }
public static void main (String args[]){
    int number[] = { 11, 22,33,44,55,66,77,88,99};
    int key = 66;
    System.out.println(" The Value of key is on the index : " + Search(number , key) );

}
}
