package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Enter the speed");
        var speed = scanner.nextDouble();

        System.out.println("Enter the time");
        var time = scanner.nextDouble();

        var result = speed * time;
        System.out.println(result + " kilometers");
    }
}











