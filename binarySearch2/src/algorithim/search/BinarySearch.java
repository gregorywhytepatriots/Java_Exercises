package algorithim.search;

public class BinarySearch {
   public  int binarySearch(int arr[], int low, int range, int x){
        if( range >= 1){
            int mid = low + (range-low)/2;
            if(arr[mid] == x){
                return x;
            }

            if(arr[mid] > x){
                return binarySearch(arr, low, mid-1, x);
            }

            return binarySearch(arr,mid+1,range, x);
        }
        return -1;
    }
}
