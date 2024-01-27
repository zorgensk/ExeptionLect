/**
 * Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
 * Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
 * 1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
 * 2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
 * 3. если вместо массива пришел null, метод вернет -3
 */

public class Task2 {
    public static void main(String[] args) {
        System.out.println(findIndexOfElem(new int []{12,3,4,563,3}, 4, 10));
        System.out.println(findIndexOfElem(null, 4, 2));


    }

    public static int findIndexOfElem(int[] arr, int num, int min) {
        if (arr == null) {
            System.out.println("arr is not null");
            return -3;
        }
        if (arr.length < min) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -2;

    }
}
