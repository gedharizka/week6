package org.gedha;

public class Soal1 {
    public static void main(String[] args) {
        int n = 100;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("BIZZBUZZ");
            }else if (i % 3 == 0){
                System.out.println("BIZZ");
            }else if(i % 5 == 0){
                System.out.println("BUZZ");
            }else {
                System.out.println(i);
            }
        }
    }
}
