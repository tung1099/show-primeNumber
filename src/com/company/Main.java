package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng SNT cần hiển thị : ");
        int number = scanner.nextInt();
        int count = 0;
        int n=2;
        while (count < number){
            if (isPrimeNumber(n)){
                System.out.print(" " + n);
                count++;
            } n++;
        }
    }
    private static boolean isPrimeNumber(int a){
        boolean check = true;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i ==0){
                check = false;
                break;
            }
        } return check;
    }
}
