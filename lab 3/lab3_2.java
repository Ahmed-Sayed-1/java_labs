import quadratic.Root;

public class lab3_2 {
    public static void main(String[] args) {
        Root r = new Root();
        Double Eq[] = {1.0, 4.0, 13.0}; // Coefficients of the quadratic equation
        System.out.println(r.apply(Eq)); // Output the roots of the equation
    }
}

