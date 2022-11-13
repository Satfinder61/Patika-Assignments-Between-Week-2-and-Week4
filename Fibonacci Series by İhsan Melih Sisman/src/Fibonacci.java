import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstOne = 0;
        int secondOne = 1;
        int input = 9;

        System.out.print(input + " Elemanlı Fibonacci Serisi : ");

        for (int i = 0; i <= input; i++) {
            System.out.print(firstOne + " ");
            int nextOne = firstOne + secondOne;
            firstOne = secondOne;
            secondOne = nextOne;


        }


    }
}
