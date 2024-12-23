package quadratic;

import java.util.function.Function;

public class Root implements Function<Double[], String> {
    @Override
    public String apply(Double[] coefficients) {
        if (coefficients.length != 3) {
            throw new IllegalArgumentException("Invalid number of parameters. Expected 3 coefficients for a quadratic equation.");
        }
        return helper(coefficients); 
    }

    private String helper(Double[] coefficients) {
        double root1, root2;
        String result;

        double discriminant = coefficients[1] * coefficients[1] - 4 * coefficients[0] * coefficients[2];

        if (discriminant > 0) {
            root1 = (-coefficients[1] + Math.sqrt(discriminant)) / (2 * coefficients[0]);
            root2 = (-coefficients[1] - Math.sqrt(discriminant)) / (2 * coefficients[0]);
            result = String.format("root1 = %.2f and root2 = %.2f", root1, root2);
        } else if (discriminant == 0) {
            root1 = -coefficients[1] / (2 * coefficients[0]);
            result = String.format("root1 = root2 = %.2f", root1);
        } else {
            double realPart = -coefficients[1] / (2 * coefficients[0]);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * coefficients[0]);
            result = String.format("root1 = %.2f + %.2fi\nroot2 = %.2f - %.2fi",
                    realPart, imaginaryPart, realPart, imaginaryPart);
        }

        return result;
    }
}

