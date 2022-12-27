// 2. Если необходимо, исправьте данный код (задание 2)

public class Main {
    public static void main(String[] args) {
        int d = 0;
        int index = 8;
        int arrLength = 6;
        int[] array = new int[arrLength];

        if (index < arrLength) {
            if (d == 0) {
                System.out.println("Arithmetic Exception --> division by zero ");
            } else {
                System.out.println("Result -> " + array[index] / d);
            }
        } else {
            System.out.println(": Array index out of bounds exception :");
        }

    }
}