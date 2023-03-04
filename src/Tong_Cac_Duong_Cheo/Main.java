package Tong_Cac_Duong_Cheo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,sum_Left=0,sum_Right = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số dòng và số cột: ");
        x = sc.nextInt();
        int[][] array = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("Ô thứ: [" + i + "][" + j + "] = ");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }

        for (int i = 0; i <x ; i++) {
            for (int j = 0; j < x; j++) {
                if (i==j){
                    sum_Right += array[i][j];
                }
                if (j == array.length - 1 - i){
                    sum_Left += array[i][j];
                }
            }
        }
        System.out.print("Tổng đường chéo phải: " + sum_Right + "\n");
        System.out.print("Tổng đường chéo Trái: " + sum_Left);

    }
}
