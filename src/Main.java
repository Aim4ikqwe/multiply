import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите 1 число");
        int a = input.nextInt();
        System.out.println("Введите 2 число");
        int b = input.nextInt();
        int result = 0; // Переменная для хранения результата
        System.out.println("Выберите метод для умножения");
        int method = input.nextInt();
        switch (method) {
            case 1: {
                for (int i = 0; i < b; i++) {
                    result += a; // Прибавляем 'a' к результату 'b' раз
                }

                System.out.println("Произведение " + a + " и " + b + " равно " + result);
                break;
            }

            case 2: {
                // Вызов рекурсивного метода для вычисления произведения
                result = multiply(a, b);

                System.out.println("Произведение " + a + " и " + b + " равно " + result);
                break;
            }
            case 3: {
                result = multiply2(a, b);

                System.out.println("Произведение " + a + " и " + b + " равно " + result);
                break;
            }
        }
        }
    public static int multiply(int a, int b) { // Рекурсивный метод для умножения
        // Базовый случай: если b равно 0, результат - 0
        if (b == 0) {
            return 0;
        }
        return a + multiply(a, b - 1); // Рекурсивный случай: прибавляем 'a' и уменьшаем 'b'
    }
    public static int multiply2(int a, int b) {
        int result = 0; // Результат умножения
        while (b > 0) {
            // Если последний бит b равен 1, добавляем 'a' к результату
            if ((b & 1) == 1) {
                result += a;
            }
            // Сдвигаем 'a' влево (умножаем на 2)
            a <<= 1;
            // Сдвигаем 'b' вправо (делим на 2)
            b >>= 1;
        }
        return result;
}
}