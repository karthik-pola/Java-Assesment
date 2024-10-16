public class Add<T> {

    private T first;
    private T second;

    public Add(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public Object get() {
        if (this.first instanceof String && this.second instanceof String) {
            // Concatenate if both are Strings
            return (String) this.first + (String) this.second;
        } else if (this.first instanceof Number && this.second instanceof Number) {
            // Add if both are Numbers
            return ((Number) this.first).doubleValue() + ((Number) this.second).doubleValue();
        } else {
            throw new IllegalArgumentException("Unsupported types for addition");
        }
    }

    public static void main(String[] args) {
        // Example with Strings (Concatenation)
        Add<String> addStrings = new Add<>("Karthik", "Pola");
        System.out.println(addStrings.get());  // Output: KarthikPola

        // Example with Integers (Addition)
        Add<Integer> addIntegers = new Add<>(10, 20);
        System.out.println(addIntegers.get());  // Output: 30.0

        // Example with Doubles (Addition)
        Add<Double> addDoubles = new Add<>(10.5, 20.5);
        System.out.println(addDoubles.get());  // Output: 31.0
    }
}
