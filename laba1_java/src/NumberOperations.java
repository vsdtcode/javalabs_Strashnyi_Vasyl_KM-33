import java.util.ArrayList;



public class NumberOperations {
    public static void main(String[] args) {

        ArrayList<Number> list_of_numbers = new ArrayList<>();

        list_of_numbers.add(10);
        list_of_numbers.add(20.5f);
        list_of_numbers.add(30);
        list_of_numbers.add(40.7f);
        list_of_numbers.add(50);
        list_of_numbers.add(60.3f);
        list_of_numbers.add(70);
        list_of_numbers.add(80.1f);
        list_of_numbers.add(90);
        list_of_numbers.add( 100.9f);

        System.out.println("\nВивід всіх чисел зі списку: "+list_of_numbers);

        System.out.println("\nВивід чисел у форматі цілих: ");
        for (Number number : list_of_numbers) {
            System.out.print(number.intValue() + "; ");
        }

        System.out.println("\n\nВивід чисел у форматі дробових  з 2ма знаками після коми: ");
        for (Number number : list_of_numbers) {
            System.out.printf("%.2f; ", number.floatValue());
        }

        ArrayList<Integer> list_of_integers = new ArrayList<>();
        ArrayList<Float> list_of_floats = new ArrayList<>();

        for (Number number : list_of_numbers) {
            if (number instanceof Integer) {
                list_of_integers.add((Integer) number);
            } else if (number instanceof Float) {
                list_of_floats.add((Float) number);
            }
        }

        System.out.println("\n\nЧисла в різних списках залежності від їх типу: " );

        System.out.println("\nЦілі: " +list_of_integers);
        System.out.println("\nДробові : " + list_of_floats);

        float sum_var = 0;
        for (Number number : list_of_numbers) {
            sum_var += number.floatValue();
        }

        System.out.println("\nСума всіх чисел у списку: " + sum_var);
    }
}
