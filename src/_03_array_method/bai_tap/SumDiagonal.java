package _03_array_method.bai_tap;

import java.util.Scanner;

public class SumDiagonal {
    public static void main(String[] args) {
    int n;
    int sum = 0;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nhập vào bậc của ma trận: ");
    n = scanner.nextInt();

    int A[][] = new int[n][n];

    System.out.println("Nhập các phần tử cho ma trận: ");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print("A[" + i + "]["+ j + "] = ");
            A[i][j] = scanner.nextInt();
        }
    }



    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i == j) {
                sum += A[i][j];
            }
        }
    }

    System.out.println("Tổng các phần tử nằm trên đường chéo chính = " + sum);
}
}