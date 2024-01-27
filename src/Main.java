/**
 * Реализуйте метод, принимающий в качестве аргументов целочисленный массив и некоторый допустимый минимум.
 * Если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки, иначе - длину массива.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(getArrLenghts(new int []{1,2,3,4,5,6},10));
    }


    public static int getArrLenghts(int[] num,int minimum){
        if (num.length < minimum){
            return -1;
        }
        return num.length;
    }
}
