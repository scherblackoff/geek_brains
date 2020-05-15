package lesson_2;

import java.util.Arrays;

public class lesson_2 {public static void main(String[] args) {

}

// 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//   С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void ReplaceZeroOnOne() {
        int[] replace = {1, 0, 1, 1, 1, 0, 0, 1, 0, 1};
        for (int i = 0; i < replace.length; i++) {
            if (replace[i] == 1) {
                replace[i]--;
            } else {
                replace[i]++;
            }
        }
    }

// 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void MakeAnArray() {
        int[] MakeArray = new int[8];
        for (int i = 0; i < MakeArray.length; i++) {
            MakeArray[i] = i * 3;
        }
        System.out.println(Arrays.toString(MakeArray));
    }

// 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void MakeAnArrayWithDouble() {
        int[] GreaterThanSix = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < GreaterThanSix.length; i++) {
            if (GreaterThanSix[i] < 6) {
                GreaterThanSix[i] = GreaterThanSix[i] * 2;
            }
        }
        System.out.println(Arrays.toString(GreaterThanSix));
    }

// 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
//    заполнить его диагональные элементы единицами;
    public static void MakeASquareArray() {
        int[][] ASquareArray = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    ASquareArray[i][j] = 1;
                }
                System.out.print(ASquareArray[i][j] + " ");
            }
            System.out.println();
        }
    }

// 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    public static void FindTheMinAndMax() {
        int[] TheMinAndMax = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int max = TheMinAndMax[0];
        int min = TheMinAndMax[0];
        for (int i = 1; i < TheMinAndMax.length; i++) {
            if (TheMinAndMax[i] > max) {
                max = TheMinAndMax[i];
            }
            if (TheMinAndMax[i] < min) {
                min = TheMinAndMax[i];
            }
        }
        System.out.println(min);
        System.out.println(max);

    }

// 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен
//    вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
//    Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
//    граница показана символами ||, эти символы в массив не входят.
    public static boolean FindABalance(int[] ABalance) {
        int LeftSumm, RightSumm;
        for (int i = 0; i < ABalance.length; i++) {
            LeftSumm = 0;
            RightSumm = 0;
            for (int j = 0; j < i; j++) {
                LeftSumm += ABalance[j];
            }
            for (int j = i; j < ABalance.length; j++) {
                RightSumm += ABalance[j];
            }
            if (LeftSumm == RightSumm) {
                return true;
            }
        }
        return false;
    }

// 7. **** Написать метод, которому на вход подается одномерный массив и число n
//   (может быть положительным, или отрицательным), при этом метод должен
//   сместить все элементымассива на n позиций. Для усложнения задачи нельзя
//   пользоваться вспомогательными массивами.
    public static void MakeAnOffset(int[] AnOffset, int n) {
        if (n > 0) {

            for (int i = 0; i < n; i++) {
                int temp = AnOffset[AnOffset.length - 1];
                for (int j = AnOffset.length - 1; j > 0; j--) {
                    AnOffset[j] = AnOffset[j - 1];
                }
                AnOffset[0] = temp;
            }
        }
        if (n < 0) {
            for (int i = 0; i > n; i--) {
                int temp = AnOffset[AnOffset.length - 1];
                for (int j = AnOffset.length - 1; j > 0; j--) {
                    AnOffset[j] = AnOffset[j - 1];
                }
                AnOffset[0] = temp;
            }

        }
        System.out.println(Arrays.toString(AnOffset));
    }
}
