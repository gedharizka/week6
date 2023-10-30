package org.gedha;

public class Soal2 {
    public static void main(String[] args) {
        int n = 5;
        int currentNumber = 1;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNumber);
                currentNumber += 2;
                if (j < i) {
                    System.out.print("_");
                }
            }
            System.out.println();
            currentNumber = 1;
        }

    }
}
