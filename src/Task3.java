/**
 * Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
 * Необходимо посчитать и вернуть сумму элементов этого массива. При этом накладываем на метод 2 ограничения:
 * метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
 * Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке
 */
public class Task3 {
    static int[][] ints = new int[][]{
            {1, 0, 1, 1, 1},
            {1, 0, 1, 1, 1},
            {1, 0, 1, 1, 1},
            {1, 0, 5, 1, 1},
            {1, 0, 1, 1, 1}
    };

    public static int sumElem(int[][] matrix) {
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix.length != matrix[i].length) {
                throw new RuntimeException("Array is not matrix");
            }

            for (int j = 0; j < matrix.length; j++) {
                int num = matrix[i][j];
                if (num != 0 && num != 1) {
                    throw new RuntimeException("Elem is not 1 or 0");
                }
                counter += num;
            }
        }
        return counter;
    }

    public static boolean isNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    public static void main(String[] args) {

        System.out.println(isNumber("5.347"));

    }
}
