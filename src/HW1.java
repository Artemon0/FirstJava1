public class HW1 {

    void square(int a, int b) {
        int area = a*b;
        System.out.println(area);

    }
    void CtoF(double celsius) {
        double fahrenheit = (celsius*9/5)+32;
        System.out.println(fahrenheit);
    }

    void sumAndAverage(int a, int b, int c) {
        int sum = a + b + c;
        // var 1
        double avg = ( (double) a + (double) b + (double) c ) / 3;
        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + avg);

    }

}
