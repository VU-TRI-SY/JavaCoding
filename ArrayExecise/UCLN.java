package ArrayExecise;

public class UCLN {
    public static int ucln(int a, int b){
        // a,b > 0
        // a = 30, b = 98
        
        int i = Math.min(a, b);
        while(a % i != 0 || b % i != 0){
            i--;
        }

        return i;
    }

    public static int bcnn(int a,int b){
        // i>= a, i>=b
        int i = Math.max (a,b);
        while (i % a != 0 || i % b !=0) {
            i++;
        }
        return i;
    }

    public static void main(String[] args){
        System.out.println(ucln(200, 550));
    }
}
