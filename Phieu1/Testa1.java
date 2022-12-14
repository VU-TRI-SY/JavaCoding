package Phieu1;

public class Testa1 {
    //function: C/C++
    //method: Java
    public static int maximum (int[] arr){
        int max_ele = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max_ele){
                max_ele = arr[i]; //assignment operator
            }
        }

        return max_ele;
    }

    public static int countMaximum(int[] arr){
        int max_ = maximum(arr);
        int count = 0;
        for(int j = 0; j < arr.length; j++){
            if (arr[j] == max_) {
                count++;
            }
        }
        return count;
    }

    public static boolean isSorted( int[] arr) {
        for( int i = 0; i <= arr.length-2; i++){
            if (arr[i] >= arr[i+1]){
                return false;
            }
        }
        // khi vòng for kết thúc ===> return false không được chạy tới
        //có nghĩa: Không tồn tại cặp phần tử nào trong arr phá vỡ tính chất tăng dần của mảng
        //===> có thể return true
        return true;
    }

    public static boolean checkArr( int[] arr ){
        //1 2 3 4 3 5 1
        int i = 0, j = arr.length - 1;
        while (j >= i){
            if(arr[i] != arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static int[] increaseArray ( int[] arr, int z ){ //return type: an array
        int[] res = new int[arr.length];
        for (int i=0; i < arr.length; i++){
            res[i] = arr[i] + z;
        }
        return res;
    }

    public static int[] doubleIfContainsPositive( int[] arr ){
        int [] res = new int[arr.length];
        boolean hasPositive = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                hasPositive = true;
                break;
            }
        }

        if(hasPositive){
            for(int i = 0; i < arr.length; i++){
                res[i] = arr[i] * 2;
            }
        }else{
            for(int i = 0; i < arr.length; i++){
                res[i] = arr[i];
            }
        }

        // int hs = 1;

        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i] > 0){
        //         hs = 2;
        //         break;
        //     }
        // }

        // for(int i = 0; i < arr.length; i++){
        //     res[i] = arr[i] * hs;
        // }

        return res;
    }

    public static String toString( int[] arr ){
        // 1 2 3 4 5
        // ==> return String: "1 2 3 4 5"
        String res = "";
        //"1" ==> "1" + " " + "2" ==> "1 2"
        for(int x : arr){
            res = res + x + " ";
        }
        return res;
    }

    public static int[] copyStartingValues( int[] arr ){
        int n;
        if(arr.length >= 3){
            n = 3;
        }else{
            n = arr.length;
        }
        int[] res = new int[n];
        for(int i = 0; i < n; i++){
            res[i] = arr[i];
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr = {0, -7, 1};
        int[] res = copyStartingValues(arr);
        System.out.println(toString(res));
        
    }
}
