package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

        System.out.print("write your binary number: ");
        int binum = in.nextInt();
        System.out.printf("Ваше число в двоичной системе исчисления: %d \n", binum);

        String bi = Integer.toString(binum);
        int kek = Integer.parseInt(bi, 2);
        System.out.println("Ваше число в десятиричной системе исчесления: " + kek);


    }
}
