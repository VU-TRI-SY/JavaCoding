package ArrayExecise;

public class SoHoanHao {
    public static boolean checkSoHH(int n){
        if(n <= 1){
            return false;
        }

        int sum = 0;
        //[1, n-1]
        for(int i = 1; i <= n/2; i++){
            if(n % i == 0){
                sum = sum + i;
            }
        }

        if(sum == n){
            return true;
        }else{
            return false;
        }

        // return sum == n;
    }

    public static void main(String[] args){
        int n = 4;
        System.out.println(checkSoHH(n));
    }
}
