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

    public static void main(String[] args){
        Fraction[] arr = {new Fraction(1,2)
                        , new Fraction(-1, 3)
                        , new Fraction(2, 3)
                        , new Fraction(-1, 2)
                        , new Fraction(1, 4),
                        new Fraction(-1, 4)};
        Fraction res = maximum(arr);

        System.out.println("arr[2] before mofdify res");
        System.out.println(arr[2].toString());

        res.setNumerator(10);
        res.setDenomerator(21);
        System.out.println("Res:");
        System.out.println(res.toString());

        System.out.println("arr[2] after mofdify res");
        System.out.println(arr[2].toString());
    }
}
