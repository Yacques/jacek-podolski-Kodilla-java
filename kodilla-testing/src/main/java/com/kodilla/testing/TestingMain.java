package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator tester = new Calculator();

        int a = 15;
        int b = 7;
        int result1 = tester.add(a, b);

        if(result1 == 22) {

            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }

        int x = 30;
        int y = 17;
        int result2 = tester.subtract(x, y);

        if(result2 == 13) {
            System.out.println("Test Ok");
        } else {
            System.out.println("Error!");
        }
    }
}
