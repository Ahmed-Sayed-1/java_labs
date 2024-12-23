import lab4.*;
class lab4_1 {
    public static void main(String[] args) {
        Fun fun = new Fun();
        double[] xl = {1.0, 2.0, 3.0}; // Example array

        try {
            System.out.println(fun.divided(4, 0));
            System.out.println(fun.mul(4, -1));
            System.out.println(fun.arr(xl, 4));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Size is greater than array size");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exo e) {
            System.out.println(e.getMessage());
        }
    }
}

