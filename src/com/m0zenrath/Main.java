package com.m0zenrath;

import java.util.Scanner;

// DRY code = Don't Repeat Yourself! ;)
public class Main {

    public static void main(String[] args) {

        int[] array = arrayInput();
        boolean check = ifExist(6,array);
        printMsg(check);

    }

    public static int[] arrayInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, insert array length: ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        System.out.println("Please, insert " + arraySize + " values: ");
        for (int i=0;i<array.length;i++){
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static boolean ifExist(int number, int[] array){
        boolean exist = false;
        for (int i : array) {
            if (i == number){
                exist = true;
                break;
            }
        }
        return exist;
    }

    public static void printMsg(boolean trueOrFalse){
        if (trueOrFalse) {
            System.out.println("Number is exist!");
        }else {
            System.out.println("Number is not exist!");
        }

    }
}
