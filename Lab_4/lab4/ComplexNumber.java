package lab4;
class ComplexNumber<T extends Number> {
    private T real;
    private T imaginary;

    public ComplexNumber(T real, T imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public T getReal() {
        return real;
    }

    public void setReal(T real) {
        this.real = real;
    }

    public void setImaginary(T imaginary) {
        this.imaginary = imaginary;
    }

    public T getImaginary() {
        return imaginary;
    }

    public ComplexNumber<Double> add(ComplexNumber<? extends Number> c) {
        double realPart = this.real.doubleValue() + c.getReal().doubleValue();
        double imaginaryPart = this.imaginary.doubleValue() + c.getImaginary().doubleValue();
        return new ComplexNumber<>(realPart, imaginaryPart);
    }

    public ComplexNumber<Double> subtract(ComplexNumber<? extends Number> c) {
        double realPart = this.real.doubleValue() - c.getReal().doubleValue();
        double imaginaryPart = this.imaginary.doubleValue() - c.getImaginary().doubleValue();
        return new ComplexNumber<>(realPart, imaginaryPart);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}

