import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double [] secondNumbers = {1.57, 7.654, 9.986};
        int [] temperature = {1, 3, 6, 5, 10};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < secondNumbers.length; i++) {
            System.out.print(secondNumbers[i]);
            if (i < secondNumbers.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < temperature.length; i++) {
            System.out.print(temperature[i]);
            if (i < temperature.length - 1){
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = secondNumbers.length - 1; i >= 0; i--) {
            System.out.print(secondNumbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = temperature.length - 1; i >= 0; i--) {
            System.out.print(temperature[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] = numbers [i] + 1;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}