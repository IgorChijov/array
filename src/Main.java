import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] money =  {55555, 66666, 77777, 88888, 99999};
        int sum = 0;
        for (int i = 0; i < money.length; i++) {
            sum += money[i];
        }
        System.out.println("Сумма выплат за месяц составила " + sum + " рублей");


        int[] arr = {1415, 6535, 14, 1456, 764, 9032, 83};
        int min = money[0];
        int max = money[0];
        for (int i = 0; i < money.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Минимальная сумма составила " + min + " , а максимальная " + max);


        int[] arr1 = {123, 616, 5256, 9535, 10};
        int sum1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
        }
        double average = sum1 / (double) arr1.length;
        System.out.println("Средняя сумма затрат за месяц составила " + average);


        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}