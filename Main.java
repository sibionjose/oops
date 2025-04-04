class Complex {
    double real, imag;

    public void setComplexNumber(double realPart, double imagPart) {
        real = realPart;
        imag = imagPart;
    }

    public void display() {
        if (imag < 0)
            System.out.println(real + " - " + Math.abs(imag) + "i");
        else
            System.out.println(real + " + " + imag + "i");
    }

    public Complex add(Complex c) {
        double resultReal = real + c.real; 
        double resultImag = imag + c.imag;
        Complex sum = new Complex();
        sum.setComplexNumber(resultReal, resultImag); 
        return sum; 
    }
}

public class Main {
    public static void main(String[] args) {
        Complex complex1 = new Complex();
        complex1.setComplexNumber(3.5, 4.5);

        Complex complex2 = new Complex();
        complex2.setComplexNumber(2.5, 3.5);

        System.out.print("Complex Number 1: "); 
        complex1.display();
        
        System.out.print("Complex Number 2: ");
        complex2.display();

        Complex sum = complex1.add(complex2);

        System.out.print("Sum of the complex numbers: ");
        sum.display();
    }
}
