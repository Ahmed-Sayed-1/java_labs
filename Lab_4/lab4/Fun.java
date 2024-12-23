package lab4;
public class Fun {
   public double divided(double x, double y) throws RuntimeException {
        if (y == 0) {
            throw new RuntimeException("Cannot divide by zero");
        }
        return x / y;
    }

   public double mul(double x, double y) throws Exo {
        if (y < 0) {
            throw new Exo("Cannot multiply by a negative number");
        }
        return x * y;
    }

   public String arr(double[] x, int size) throws IndexOutOfBoundsException {
        if (size > x.length) {
            throw new IndexOutOfBoundsException("Size is greater than array length");
        }
        return "Done";
    }
}
