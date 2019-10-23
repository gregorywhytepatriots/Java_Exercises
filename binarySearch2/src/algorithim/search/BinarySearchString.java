package algorithim.search;

public class BinarySearchString {
    public  int binarySearchString (String arr[], String x) {
        int low = 0;
        int high = arr.length -1;
        int mid;
        while( low <= high){
             mid = (low + high)/2;
            if(arr[mid].compareTo(x) < 0){
                low = mid + 1;
            } else if(arr[mid].compareTo(x) > 0 ){
                high = mid -1;
            } else {
                return  mid;
            }
        }
        return -1;
    }
}
