import java.util.function.Function;
class lab3_1 {
    public static void main(String[] args) {
      Function<Integer, Float> intToFahrenheit = new Function<Integer, Float>() {
            @Override
            public Float apply(Integer i) {
               
                return (i * 9.0f / 5) + 32;
            }
        };
        System.out.println(intToFahrenheit.apply(5)); 
    }
}
