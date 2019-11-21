package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int [] []nums=new int [] []
                {

                };
        Scanner entry = new Scanner(System.in);
        System.out.println("Enter the numbers, 3 numbers per row, enter after each: ");
        int entry1 = Integer.parseInt(entry.nextLine());
        int entry2 = Integer.parseInt(entry.nextLine());
        int entry3 = Integer.parseInt(entry.nextLine());
        int entry4 = Integer.parseInt(entry.nextLine());
        int entry5 = Integer.parseInt(entry.nextLine());
        int entry6 = Integer.parseInt(entry.nextLine());
        int entry7 = Integer.parseInt(entry.nextLine());
        int entry8 = Integer.parseInt(entry.nextLine());
        int entry9 = Integer.parseInt(entry.nextLine());
        int [] []mnums=new int [] []
                {
                        {entry1, entry2, entry3},
                        {entry4, entry5, entry6},
                        {entry7, entry8, entry9}
                };



        for(int i=0;i<nums.length;i++){
            for (int j=0;j<nums[i].length;j++){
                System.out.printf("%d",nums[i][j]);
            }
            System.out.println();
        }

        int mnums1 = mnums[0][0] * mnums[1][1] * mnums[2][2];
        int mnums2 = mnums[0][1] * mnums[1][2] * mnums[2][0];
        int mnums3 = mnums[0][2] * mnums[1][0] * mnums[2][1];
        int mnums4 = mnums[0][2] * mnums[1][1] * mnums[2][0];
        int mnums5 = mnums[0][0] * mnums[1][2] * mnums[2][1];
        int mnums6 = mnums[0][1] * mnums[1][0] * mnums[2][2];
        int answer = mnums1+mnums2+mnums3-mnums4-mnums5-mnums6;
        System.out.print("Answer is: ");
        System.out.println(answer);
    }
}
