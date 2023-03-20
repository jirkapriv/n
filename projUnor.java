package com.company;

import java.util.Scanner;

public class projUnor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int vyska;
        int n = 0;
        int j;
        int pomoc;


        for (int m = 0; m > -1; m++) {

            System.out.println("To make a pyramid press             1");
            System.out.println("To make a stairs press              2");
            System.out.println("To make a chessboard press          3");
            System.out.println("To make a number rectangle press    4");
            System.out.println("To exit press                       5");

            int inputJ = scanner.nextInt();

            if (inputJ == 1) {

                System.out.println("pyramid");

                vyska = scanner.nextInt();
                pomoc = vyska;
                for (int i = 1; i <= vyska; i++) {

                    System.out.println("");


                    for (j = 0; j < pomoc; j++) {

                        System.out.print(" ");

                    }
                    pomoc--;


                    for (int c = 0; c < i + n; c++) {

                        System.out.print(Math.min(i, 9));

                    }
                    n += 1;
                }
                n = 0;
                System.out.println("");
                System.out.println("");


            } else if (inputJ == 2) {

                System.out.println("stairs");
                System.out.println("Zadej výšku");

                int vyskaS = scanner.nextInt();
                int pomocS = vyskaS;
                int pomocDS = vyskaS;
                for (int i = 0; i < vyskaS + 1; i++) {

                    System.out.println("");
                    for (int c = pomocDS; c > 0; c--) {

                        System.out.print(" ");

                    }
                    pomocDS--;
                    for (int v = 0; v < i; v++) {


                        if (pomocS % 2 == 0) {
                            System.out.print(2);
                        } else {

                            System.out.print(1);
                        }
                    }
                    pomocS--;
                }
                System.out.println("");
                System.out.println("");


            } else if (inputJ == 3) {

                System.out.println("chessboard");
                System.out.println("");
                System.out.println("");
                for (int l = 8; l > 0; l--) {
                    if (l % 2 == 0) {
                        for (int g = 4; g > 0; g--) {

                            System.out.print("XO");

                        }
                    } else {
                        for (int g = 4; g > 0; g--) {

                            System.out.print("OX");

                        }
                    }
                    System.out.println("");
                }
                System.out.println("");
                System.out.println("");

            } else if (inputJ == 4) {

                System.out.println("number rectangle");

                System.out.println("Zadej prostřední číslo...");
                int prostredek = scanner.nextInt();
                System.out.println("Zadej délku...");
                int delka = scanner.nextInt();


                for (int h = 1; h <= prostredek; h++) {

                    for (int p = 0; p < delka; p++) {

                        System.out.print(h);

                    }
                    System.out.println();
                }
                for (int h = prostredek - 1; h >= 1; h--) {

                    for (int p = 0; p < delka; p++) {

                        System.out.print(h);

                    }
                    System.out.println();
                }


            } else if (inputJ == 5) {

                break;

            } else {

                System.out.println("Error");

            }
        }

    }
}
