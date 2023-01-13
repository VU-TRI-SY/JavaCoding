package ArrayExecise;

public class JavaEx {
    //Bai 155
    public static int xaX (int [] arr, int x) {
        int far = arr[0];
        for (int i = 0; i < arr.length; i++) { //i có thể bắt đầu từ 1 vì đã giả sửa arr[0] cách xa x nhất
            if (Math.abs(arr[i] - x) > Math.abs(far - x)) {
                far = arr[i];
            }
        }
        return far;
    } //OK

    //Bai 156
    public static int ganX (int [] arr, int x) {
        int near = arr[0];
        for (int i = 0; i <arr.length; i++) {//i có thể bắt đầu từ 1 vì đã giả sửa arr[0] gần x nhất
            if (Math.abs(arr[i] - x) < Math.abs(near - x)) {
                near = arr[i];
            }
        }
        return near;
    } //OK

    //Bai 157
    public static int[] timDoan (int [] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        //return min, max; 
        //Không thể return 2 giá trị cho 1 method --> Nên return 1 array với 2 element, a[0] là min, a[1] là max
        int[] res = {min,max};
        return res;
    }

    //Bai 158
    public static int[] timDoanX (int [] arr) { //phải return đoạn [-x, x] --> return 1 array với size 2 chứa 2 phần tử [-x, x]
        int x = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) >= Math.abs(x)) {
                x = Math.abs(arr[i]);
            }
        }
        int[] res = {-x, x};
        return res;
    }

    //Bai 159
    public static int firstGreater(int [] arr) {
        int first = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 2003) {
                first = arr[i];
                break;
            }
        }
        return first;

        // Cách ngắn
        // for(int x: arr){
        //     if(x > 2003) 
        //         return x;
        // }
        // return -1;
    } //OK

    //Bai 160
    public static double lastGreater(double [] arr) {
        // double res = -1;
        // for (int i = 0; i < arr.length; i++) {

        // }
        //Tìm số lớn nhất cuối cùng --> đi từ cuối về đầu
        double res = -1;
        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i] < 0 && arr[i] > res)
                return arr[i]; //tìm thấy lập tức return và kết thúc
        }
        return res;//Không tìm thấy
    }
    //Bai 161
    public static int giaTriDauTien (int [] arr, int x, int y) {
        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= x && arr[i] <= y) {
                // res = arr[i];
                // break;
                //khi tìm thấy res --> return và dừng lại ngay
                return arr[i];
            }
        }
        return res;
    }
    
    //Bai 163
    public static boolean soChinhPhuong (int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) { //có thể cho i chạy từ 1 đến sqrt của n
            if (i * i == n) {
                return true;
            }
        }
        return false;
    }
    public static int squareNumber (int [] arr) {
        // int square = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(soChinhPhuong(arr[i])) {
                // square = arr[i];
                // break;
                return arr[i]; //dùng return để return ra kết quả và lập tức dừng method lại
            }
        }
        return -1; //return -1 nếu không tìm thấy số chính phương nào trong array
    }
  
    //Bai 165
    public static int firstDigit (int n) {
        int x = 0;
        while (n > 9) {
            x = n % 10;
            n = n / 10;
        }
        return x;
    }
    public static int chuSoLe (int []arr) {
        // int first = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (firstDigit(arr[i]) % 2 == 1) {
                // first = arr[i];
                // break;
                return arr[i];
            }
        }
        return -1; //return -1 nếu không tìm được kết quả
    }

    //Bai 169
    public static int minEven(int [] arr) {
        
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max /*&& arr[i] % 2 == 0*/) { //phải tìm max là số lớn nhất trong mảng, không phải là số chẵn lớn nhất
                max = arr[i];
            }
        }
        // return (max+2); //nếu max là số chẵn ---> return đúng nhưng nếu max là số lẻ thì sai, phải return max+1
        if(max % 2 == 0) return max + 2;
        else return max + 1;
    }
}
