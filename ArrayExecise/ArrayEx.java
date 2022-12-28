package ArrayExecise;

public class ArrayEx {
    public static double findMinimumPositive( double[] arr) {
        double min = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
            {
                if(min == -1){
                    min = arr[i];
                }else{
                    if(min > arr[i]){
                        min = arr[i];                    
                    }
                }
            }
                
        }
        return min;
    }

    public static boolean isPrime(int n){
        if(n < 2)
            return false;
        
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int soNguyenTo (int[] arr) {
        for (int i = arr.length - 1; i >=0; i--) {
            if (isPrime(arr[i])) {
                return i;
            }
        }
        return -1;
    }

    public static int maxNegative (int [] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (max == 0) {
                    max = arr[i];
                }
                else {
                    if (max < arr[i]) {
                        max = arr[i];
                    }
                }
            }
        }
        return max;
    }

    public static int xaXnhat(int[] arr, int x){
        int res = 0;
        int k = -1;
        for(int temp : arr){
            if(Math.abs(temp-x) > k){
                res = temp;
                k = Math.abs(temp-x);
            }
        }
        return res;
    }
    //min = 0.5
    public static void main(String[] args){
        int[] arr = {-4, -2, 4, 5, -3, 0, 1};
        System.out.println(xaXnhat(arr, 1));
    }
}
