public class Fraction {
    
    private int numerator;
    private int denominator; 

    public Fraction (int numerator, int denominator) {
        this.numerator = numerator; 
        this.denominator = denominator; 
    }

    public Fraction getSum(Fraction s2) {
        int num = (this.numerator * s2.denominator) + (this.denominator*s2.numerator);
        int den = (this.denominator * s2.denominator);
        return new Fraction(num, den);

    }

    public String toString() {
        return numerator + "/" + denominator; 
    }


public static void main(String[] args) {
    Fraction s1 = new Fraction(1, 2);
    Fraction s2 = new Fraction(3, 4);

    System.out.println(s1.getSum(s2));

    
}






}
