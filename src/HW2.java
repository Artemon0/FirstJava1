/*Сума цифр числа, поки не залишиться одна цифра

Умова:
Задано число 9875. Обчислити суму його цифр:

9+8+7+5 = 29
2+9 = 11
1+1 = 2


Відповідь: 2.

Підказка: використати вкладений while.
*/

package Homeworks;

public class HW2 {


    public static void task1() {
        int a = 9875;


        while (a > 9) {


            int sum = 0;
            while (a != 0) {
                sum += a % 10;
                a /= 10;
            }
            a = sum;

        }

        System.out.println("Відповідь: " + a);
    }

    public static void task2() {

        int a = 12, b = 4;

        for (int count = 1; count < 6; count++) {
            if (count == 1) {
                System.out.println(a + b);
            } else if (count == 2) {
                System.out.println(a - b);
            } else if (count == 3) {
                System.out.println(a * b);
            } else if (count == 4) {
                System.out.println(a / b);
            } else if (count == 5) {
                System.out.println(a % b);
            }

        }

    }

    public static void main(String[] args) {
        task1();
        task2();
    }

}


