package lesson_1;

public class Main {
// Создать пустой проект в IntelliJ IDEA и прописать метод main();
// В данном проекте пусто не будет в связи с дальнейшим выполнением домашнего задания
    public static void main(String[] args) {
//Создать переменные всех пройденных типов данных, и инициализировать их значения;
        long lo = 1234567890;
        int in = 123456789;
        double dou = 12345567.8;
        float fl = 1234.5f;
        short sh = 12345;
        char ch = 'c';
        String str = "типы данных";
//Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
    }

    public static double formula_calculate(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

//Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
//если да – вернуть true, в противном случае – false;
    public static boolean comparison_calculate(double a, double b, double sum) {
        sum = a + b;
        if (sum < 20 | sum > 10) {
            return true;
        } else {
            return false;
        }
    }

//Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль
// положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
    public static void positive_or_negative_calculate(int a) {
        if (a < 0) {
            System.out.println("Число меньше нуля");
        } else {
            System.out.println("Число больше нуля");
        }
    }

//Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число
// отрицательное;
    public static boolean positive_or_negative_calculate_2(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

//Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль
// сообщение «Привет, указанное_имя!»;
    public static void hey(String name) {
        System.out.println("Привет, " + name);
    }

//Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год
//является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void what_year(int year) {
        double first = year % 4;
        double second = year % 100;
        double third = year % 400;
        if (first == 0 && second != 0 || third == 0) {
            System.out.println("Год высокосный");
        } else {
            System.out.println("Год не высокосный");
        }
    }

}
