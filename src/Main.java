public class Main {
    public static void main(String[] args) {

        int index = 7;
        int[] a = new int[]{100, 112, 256, 349, 770};
        int[] b = new int[]{72, 86, 113, 119, 265, 445, 892};
        System.out.println(degreeOfX(2, 2, 4));
        System.out.println(findElement(a, b, index));

    }

    public static int degreeOfX(int x, int temp, int n) {

        if (n == 1) {
            return temp;
        } else {
            temp *= x;
            return (degreeOfX(x, temp, n - 1));
        }
    }

//  TODO: 1.Даны два целых числа x и n, напишите функцию для вычисления x^n
//    решение 1 - рекурсивно O(n)
//    решение 2 - улучшить решение 1 до O(lon n)
//
//  TODO: 2.Имея два отсортированных массива размера m и n соответственно,
//    вам нужно найти элемент, который будет находиться на k-й позиции
//    в конечном отсортированном массиве.
//    Массив 1 - 100 112 256 349 770
//    Массив 2 - 72 86 113 119 265 445 892
//    к = 7
//    Вывод : 256
//    Окончательный отсортированный массив -
//    72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
//    7-й элемент этого массива равен 256


    public static int findElement(int[] a, int[] b, int index) {

        int[] temp = new int[a.length + b.length];

        int i = 0, j = 0;
        for (int k = 0; k < temp.length; k++) {
            if (a[i] < b[j]) {
                temp[k] = a[i];
                if(i < a.length - 1){
                    i++;
                }
            } else {
                temp[k] = b[j];
                if(j < b.length - 1){
                    j++;
                }
            }
        }
        return temp[index-1];
    }
}