package Phieu2;

public class Testa2 {
    public static Fraction countNegatives( Fraction[] arr ){
        int count = 0;
        for(Fraction tp : arr){ // đi qua toàn bộ các elements trong arr và lần lượt gán các elements đó cho tp
            if(tp.getNumerator() < 0){
                count++;
            }
        }

        // for(int i = 0; i < arr.length; i++){
            // if(ar[i].getNumerator() < 0){
            //     count++;
            // }
        // }

        Fraction res = new Fraction(count, 1);
        return res;
    }

    public static Fraction sumUpNegatives( Fraction[] arr ){
        Fraction res = new Fraction();
        for(Fraction tp: arr){
            if(tp.getNumerator() < 0){
                res = res.add(tp);
            }
        }
        return res;
    }

    public static Fraction maximum(Fraction[] arr) {
        Fraction max = arr[0];
        for (Fraction tp:arr) {
            if (tp.toDouble() > max.toDouble()){
                max = tp;
            }
        }
        return new Fraction(max.getNumerator(), max.getDenomerator());
    }

    public static Fraction countMaximum(Fraction[] arr) {
        int count = 0;
        Fraction max_f = maximum(arr);
        for(Fraction tp:arr){
            if(tp == max_f) {
                count++;
            }
        }
        return new Fraction(count,1);
    }

    public static boolean isSorted( Fraction [] arr) {
        for(int i = 0; i <= arr.length - 2; i++) {
            if (arr[i].toDouble() > arr[i+1].toDouble()) {
                return false;
            }
        }
        return true;
    }

    public static Fraction[] increaseArray ( Fraction[] arr, Fraction z) {
        Fraction [] res = new Fraction[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i].add(z);
        }
        return res;
    }

    public static Fraction [] doubleIfContainsPositive( Fraction [] arr) {
        Fraction [] res = new Fraction[arr.length];
        boolean positive = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toDouble() > 0 ) {
                positive = true;
                break;
            }
        }

        if (positive) {
            for(int i = 0; i < arr.length; i++) {
                res[i] = arr[i].multiply(new Fraction (2,1));
            }
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                res[i] = arr[i];
            }
        }
        return res;
    }

    public static String toString (Fraction [] arr) {
        String res = "";
        for (int i = 0; i < arr.length-1; i++) {
            res = res + arr[i].toString() + ", ";
            //res += arr[i].tooString() + ", ";
        }
        res = res + arr[arr.length - 1].toString();
        return res;
    }


    public static Fraction[] selectNegatives(Fraction[] arr) {
        int count = 0, n = arr.length;
        int[] negatives = new int [n];
        for (int i = 0; i < n; i++) {
            if (arr[i].toDouble() < 0 && negatives[i] == 0) {
                negatives[i] = 1;
                count ++;
                for(int j = i+1; j < n; j++) {
                    if(arr[j].equals(arr[i])) {
                        negatives[j] = 1;
                    }
                }
            }
        }

        Fraction[] res = new Fraction[count];
        int res_index = 0;
        for(Fraction temp : arr){
            boolean check = false; // Khong ton tai temp o trong res
            if(temp.toDouble() < 0){
                for(int i = 0; i < res_index; i++){
                    if(res[i].equals(temp)){
                        check = true;
                        break;
                    }
                }
    
                if(!check){
                    res[res_index] = new Fraction(temp.getNumerator(), temp.getDenomerator());
                    res_index++;
                }
            }
        }
        return res;
    }

    //     int count = 0, n = arr.length;
    //     int[] negatives = new int [n];
    //     for (int i = 0; i < n-2; i++) {
    //         if (arr[i].toDouble() < 0 && arr[i+1].toDouble() > 0 ) {
    //             negatives[i] = 1;
    //             count ++;
    //             for(int j = i+1; j < n; j++) {
    //                 if(arr[j] == arr[i]) {
    //                     negatives[j] = 1;
    //                 }
    //             }
    //         }
    //     }
    //     Fraction[] res = new Fraction[negatives.length];
    //     for(int i = 0; i < negatives.length; i++) {
    //         res[i] = ;
    //     }
    //     return res;
    // }

    public static void main(String[] args){
        Fraction[] arr = {new Fraction(1,2),
                        new Fraction(-1, 3),
                        new Fraction(2, 3),
                        new Fraction(-1, 2),
                        new Fraction(1, 4),
                        new Fraction(-1, 4)};

        // System.out.println(increaseArray(arr, new Fraction(1/2)).toString());
        Fraction[] res = selectNegatives(arr);
    
        // for(int i = 0; i < res.length; i++){
        //     System.out.println(res[i].toString());
        // }
        System.out.println(toString(res));

        // Fraction[] arr1 = {
        //     new Fraction(-1, 2),
        //     new Fraction(-1, 3),
        //     new Fraction(-1, 4),
        //     new Fraction(1, 4),
        //     new Fraction(1,2),
        //     new Fraction(2, 3),
        //     new Fraction(3, 3)
        // };

        // System.out.println(isSorted(arr1));
    }
        
}
