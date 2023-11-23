package generic_programming;

class gen <T> {
    T data;
    void add(T data) {
        this.data = data;
    }
    T get() {
        return data;
    }
}

public class demo3 {
    public static void main(String[] args) {
        gen <Integer>obj = new gen <Integer>();
        obj.add(10);
        System.out.println(obj.get());
        // obj.add("20"); // Compile-time error
    }
}
