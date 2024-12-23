import lab4.*;
public class Complex{
    public static void main(String[] args) {
        ComplexNumber<Integer> c1 = new ComplexNumber<>(3, 4);
        ComplexNumber<Double> c2 = new ComplexNumber<>(1.5, 2.5);

        System.out.println("Complex Number 1: " + c1);
        System.out.println("Complex Number 2: " + c2);

        System.out.println("Addition: " + c1.add(c2));
        System.out.println("Subtraction: " + c1.subtract(c2));
    }
}
