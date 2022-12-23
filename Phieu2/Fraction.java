package Phieu2;

public class Fraction {
    private int numerator;
    private int denominator;
    
    public Fraction(int num, int denom) {
        if (denom != 0) {
            if (denom < 0) {
                this.numerator = -num;
                this.denominator = -denom;
            } else {
                this.numerator = num;
                this.denominator = denom;
            } //đưa tử về âm hoặc dương, và mẫu luôn dương

            this.reduce(); //tối giản phân số
        } else {
            throw new IllegalArgumentException(); //exception --> throw ra exception(lỗi)
        }
    }

    public Fraction() { //default constructor -- constructor with no argument
        this.numerator = 0;
        this.denominator = 1;
    }

    public Fraction(int num) {
        this.numerator = num;
        this.denominator = 1;
    }

    public String toString() {
        return this.numerator + "/" + this.denominator; // "1 / 2"
    }

    public Fraction changeSign() {
        return new Fraction(-this.numerator, this.denominator); 
    }

    public Fraction reverse() {
        return new Fraction(this.denominator, this.numerator);
    }

    public Fraction add(Fraction other) {
        int num = this.numerator * other.denominator + other.numerator * this.denominator;
        int denom = this.denominator * other.denominator;
        return new Fraction(num, denom);
    }

    public Fraction subtract(Fraction other) {
        int num = this.numerator * other.denominator - other.numerator * this.denominator;
        int denom = this.denominator * other.denominator;
        return new Fraction(num, denom);
    }

    public Fraction multiply(Fraction other) {
        int num = this.numerator * other.numerator;
        int denom = this.denominator * other.denominator;
        return new Fraction(num, denom);
    }

    public Fraction divideBy(Fraction other) {
        return this.multiply(other.reverse());
    }

    public double toDouble() {
        return (double)this.numerator / (double)this.denominator; // return the result that is a double number
    }

    public Fraction clone() {
        return new Fraction(this.numerator, this.denominator); // return ra một Phân số mới là bản copy của phân số hiện tại
    }

    public boolean equals(Fraction other) { //check 2 phân số bằng nhau
        return this.numerator == other.numerator && this.denominator == other.denominator;
    }

    private void reduce() { //tối giản
        if (this.numerator != 0) {
            int gcd = this.calculateGcd();
            this.numerator /= gcd;
            this.denominator /= gcd;
        } else {
            this.denominator = 1;
        }

    }
 
    public int calculateGcd() { //tìm UCLN
        int value1 = Math.abs(this.numerator);
        int value2 = this.denominator;

        while(value1 != 0 & value2 != 0) {
            if (value1 > value2) {
                value1 %= value2;
            } else {
                value2 %= value1;
            }
        }

        if (value1 == 0) {
            return value2;
        } else {
            return value1;
        }
    }

    //getter
    public int getNumerator(){
        return this.numerator;
    }

    public int getDenomerator(){
        return this.denominator;
    }

    public void setNumerator(int num){
        this.numerator = num;
    }

    public void setDenomerator(int denom){
        this.denominator = denom;
    }
}








