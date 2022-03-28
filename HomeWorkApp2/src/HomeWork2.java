/*Java 1. Homework2

@author Rumiia Pekhotnik
@version 28.03.2022*/

public class HomeWork2 {
    public static void main(String[] args) {
        printString("Весна пришла", 4);
        System.out.println(checkLeapYear(400));
    }

    public static boolean checkInterval (int a, int b) {
        return ((a + b) >= 10 & (a + b) <= 20) ? true : false;
    }

    public static void checkPositiveOrNegative (int a) {
        System.out.println (a>= 0 ? "положительное" : "отрицательное");
    }

    public static boolean checkPositiveOrNegative2 (int a) {
        return (a >= 0 ? false : true);
    }

    public static void printString (String string, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(string);
        }

    }

    public static boolean checkLeapYear (int year) {
        int b = year / 4;
        int c = year / 100;
        int d = year / 400;
        if ((d * 400 == year)| ((b * 4 == year) & (c * 100 != year))) {
            return true;
        }
        return false;
    }
}
