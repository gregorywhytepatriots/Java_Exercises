import java.util.Random;

public class Notation {
    // ON

    static Random rand = new Random();

    static int[] getRandom(int n, Random rmd){
        int[] res = new int[n];
        for(int i=0; i < n; i++)
            res[i] = i;
            for (int j= res.length-1; j>0; j--)
                swap(res, rmd.nextInt(j+1), i);
        System.out.println(res);
        /*try {
            System.out.println(res[1]);
        }
        catch(Exception e){
        System.out.println(e);
    }
*/
        return res;
    }

    static void swap(int[] a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j]=t;
    }

    public static int ntn_element(int[] a, int low, int high, int n){

        if(low == high -1)
            return low;
        int q= randomPartition(a, low, high);
        return q;
    }

    static int randomPartition(int[] a, int low, int high){
        swap(a, low+rand.nextInt(high - low), high -1);
        int x = a[high-1];
        int l = low - 1;
        for(int j=low; j<high; j++){
            if(a[j]<= x){
                ++l;
                swap(a,l, j);
            }
        }


        return l;
    }

    public static void main(String[] args) {
        for(int i=0;i<10000; i++){
            int n =rand.nextInt(10)+1;
            System.out.println(n);
            int[]  p = getRandom(n,rand);
            int k = rand.nextInt(n);
            int res = ntn_element(p, 0, n, k);
            if(res != k){
                System.out.println(res + " " + k);
            }

        }

    }
}
