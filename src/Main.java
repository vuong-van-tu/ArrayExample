import com.sun.xml.internal.ws.api.model.ExceptionType;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Linear Equation Resolver");
//        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("a: ");
//        double a = scanner.nextDouble();
//
//        System.out.print("b: ");
//        double b = scanner.nextDouble();
//
//        if (a != 0) {
//            double solution = -b / a;
//            System.out.printf("The solution is: %f!", solution);
//        } else {
//            if (b == 0) {
//                System.out.print("The solution is all x!");
//            } else {
//                System.out.print("No solution!");
//            }
//        }
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();

        Scanner scaner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scaner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số 5" + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }

    }

}
