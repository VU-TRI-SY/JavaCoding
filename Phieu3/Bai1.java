package Phieu3;

public class Bai1 {
    public static int digitSum(int n){
        if(n < 0){
            int x = -n;
            if(x > 0){
                return (x%10) + digitSum(n/10);
            }else return 0;
        }
        if(n > 0){
            return (n%10) + digitSum(n/10);
        }else return 0;
    }

    public static int power(int a, int n){
        if(n > 0)
            return a * power(a, n-1);
        else return 1;
    }

    public static int sumUpNegatives(int[] arr, int n){
        if(n < 0) return 0;
        if(arr[n] < 0)
            return arr[n] + sumUpNegatives(arr, n-1);
        else
            return sumUpNegatives(arr, n-1);
    }

    public static int countPositives(int[] arr, int n){
        if(n < 0) return 0;
        if(arr[n] > 0) 
            return 1 + countPositives(arr, n-1);
        else 
            return countPositives(arr, n-1);
    }

    public static int countPositivesLimited(int[] arr, int d, int t){
        if(t < d) return 0;
        if(arr[t] > 0) 
            return 1 + countPositives(arr, t-1);
        else 
            return countPositives(arr, t-1);
    }

    public static int maximum(int[] arr, int i){
        if(i == 0) return arr[0];
        return Math.max(arr[i], maximum(arr, i-1));
    }

    public static boolean isSorted(int[] arr, int i){
        if(i < 1) return true; //has only one element in [0,i]
        return (arr[i] >= arr[i-1]) && isSorted(arr, i-1);
    }

    public static boolean contains(int[] arr, int i, int x){
        if(i < 0) return false;
        if(arr[i] == x) return true;
        else
            return contains(arr, i-1, x); 
    }

    public static boolean contentCheck(char[] arr1, char[] arr2, int i){
        if(arr1.length != arr2.length) return false;
        if(i < 0) return true;
        if(arr1[i] != arr2[i]) return false;
        else return contentCheck(arr1, arr2, i-1);

        //Cach 2
        // if(arr1.length != arr2.length) return false;
        // return (arr1[i] == arr2[i]) && contentCheck(arr1, arr2, i-1);
    }

    public static boolean palindrome(char[] arr, int i){
        if(i < 0) return false;
        if(i < arr.length/2) return true;
        if(arr[i] != arr[arr.length - i - 1]) return false;
        else return palindrome(arr, i-1);
    }

    public static int getIndex(int[] arr, int i, int x){
        if(i < 0) return -1;
        // if(arr[i] == x){
        //     int res = getIndex(arr, i-1, x);
        //     if(res == -1) return i; //not found x in [0, i-1] -> return this index (return i)
        //     else return res;
        // }else{
        //     return getIndex(arr, i-1, x);
        // }
        int res = getIndex(arr, i-1, x);
        if(arr[i] == x && res == -1) return i;
        return res; 
    }

    public static String toString(int[] arr, int i){
        if(i < 0) return "";
        return toString(arr, i-1) + arr[i];
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.println(toString(arr, arr.length-1));
    }
}
