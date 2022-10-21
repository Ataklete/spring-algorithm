public class Number {
    public static final Number ONE = newOne();
    public static final Number TWO = newTwo();

    public Number() {
    }

    private static Number newOne(){
        return (new Number()).new One();
    }
    private static Number newTwo() {
        return (new Number()).new Two();
    }

    private class One extends Number {
        @Override
        public String toString() {
            return "One";
        }
    }
    private class Two extends Number {
        @Override
        public String toString() {
            return "Two";
        }
    }

    public static void main(String[] args) {
        System.out.println(Number.ONE);
        System.out.println(Number.TWO);
    }
}
