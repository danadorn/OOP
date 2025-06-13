public class Polymorphism {
        // add method
    void add (int a, int b) {
        System.out.println(a + b);
    }

    double add (double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        Polymorphism test = new Polymorphism();
        test.add(10, 20); // call int
        test.add(20, 30); // call double

        Double result = test.add(20.0, 30.0);
    }
}
