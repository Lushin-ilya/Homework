public class Homework2{
    public static void main(String[] args) {
        System.out.println(within10and20(257, 178));
        checkNegativeOrPositive(-7);
        System.out.println(checkNegative(-7));
        printWordNTimes("Привет", 5);
        whatYear(2020);

    }

    public static boolean within10and20(int a, int b) {
        if (a + b > 9 && a + b < 21) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkNegativeOrPositive(int c) {
        if (c < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное или равно 0");
        }
    }

    public static boolean checkNegative(int x) {
        if (x < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printWordNTimes(String s, int times) {
        int i = 1;
        for (i = 0; i < times; i++) {
            System.out.println(s);
        }
    }

    public static void whatYear(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) {
            System.out.println(year + " г. не высокосный");
        } else {
            System.out.println(year + " г. высокосный");
        }
    }
}


