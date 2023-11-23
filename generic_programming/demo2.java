package generic_programming;

class generic {
    public <T> void print_array(T[] array) {
        for (T element : array) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}

public class demo2 {
    public static void main(String[] args) {
        Integer[] int_array = {1, 2, 3, 4, 5};
        Double[] double_array = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] char_array = {'H', 'E', 'L', 'L', 'O'};
        String[] string_array = {"Hello", "World"};

        generic obj = new generic();

        obj.print_array(int_array);
        obj.print_array(double_array);
        obj.print_array(char_array);
        obj.print_array(string_array);
    }
}
