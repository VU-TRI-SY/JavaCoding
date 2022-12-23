public class Fraction {
    private int numerator;
    private int denominator;

    // OOP: Encapsulation
    public Fraction(int num, int denom) {
        if (denom != 0) {
            if (num * denom < 0) {
                numerator = -Math.abs(num);
                denominator = Math.abs(denom);
            } else {
                numerator = Math.abs(num);
                denominator = Math.abs(denom);
            }
            reduce();
        } else {
            // error: division by zero
            throw new IllegalArgumentException();
        }
    }

    public Fraction() {
        numerator = 0;
        denominator = 1;
    }

    private void reduce() {
        if (numerator != 0) {
            int gcd = calculateGcd();
            numerator /= gcd;
            denominator /= gcd;
        } else {
            denominator = 1;
        }
    }

    private int calculateGcd(){
        int n1 = numerator;
        int n2 = denominator;
        while(n1 != n2) {
            if(n1 > n2) {
              n1 -= n2;
            }
            
            else {
              n2 -= n1;
            }
        }
        return n1;
    }

    public void printFration() {
        System.out.println(numerator + "/" + denominator); // print "1/4"
    }

    // setter vs getter
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int newNumnerator) {
        numerator = newNumnerator;
    }

    public void setDenominator(int newDenominator) {
        denominator = newDenominator;
    }

    //-----------------------------------------------------------------------
}

class Main{
    public Fraction countNegatives(Fraction[] arr){
        int count = 0;//giả sử chưa đếm được phân số âm nào
        for(Fraction f : arr){//short hand
            if((f.getDenominator() * f.getNumerator() )< 0){
                count++; //tìm được 1 ps âm mới, tăng count lên 1 đơn vị bằng operator ++
            }
        }

        return (new Fraction(count, 1));
    }

    public int calculateGcd(int n1, int n2){
        while(n1 != n2) {
            if(n1 > n2) {
              n1 -= n2;
            }
            
            else {
              n2 -= n1;
            }
        }
        return n1;
    }

    public Fraction sumUpNegatives( Fraction[] arr ){
        Fraction res = new Fraction(0, 1);//return this object
        for(Fraction f: arr){
            if(f.getNumerator() * f.getDenominator() < 0){
                //res = res + f
                int num = res.getNumerator()*f.getDenominator() + f.getNumerator()*res.getDenominator();
                int denom = res.getDenominator() * f.getDenominator();
                int gcd = calculateGcd(num, denom);
                num = num / gcd;
                denom = denom / gcd;
                res.setNumerator(num); //update res
                res.setDenominator(denom);//update res
            }
        }
        return res;
    }

    public Fraction maximum(Fraction[] arr){
        Fraction res = arr[0];
        for(int i = 1; i < arr.length; i++){
            //so sanh res vs arr[i]
            int num1 = res.getNumerator() * arr[i].getDenominator();
            int num2 = arr[i].getNumerator() * res.getDenominator();
            if(num1 < num2){ //res < arr[i]
                res = arr[i];
            }
        }

        return res;
    }

    public Fraction countMaximum(Fraction[] arr){
        int count = 0;
        Fraction max_frac = maximum(arr);
        for(Fraction f : arr){
            //so sanh f voi max_frac
            if(f.getDenominator() == max_frac.getDenominator()){
                if(f.getNumerator() == max_frac.getNumerator()){
                    count++;
                }
            }
        }
        return (new Fraction(count, 1));
    }

    public static void main(String[] args){
        int[] arr = new int[2];
        System.out.println(arr[3]);
    }
}
