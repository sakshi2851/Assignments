package com.company;
import java.util.Scanner;
public class Java2 {
    public static void main(String args[]) {
        int num, start, end, i, rem, temp, counter = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the start number:");
        start = scanner.nextInt();
        System.out.println("Enter the end number:");
        end = scanner.nextInt();
        scanner.close();

        for(i = start + 1; i < end; i++){
            temp = i;
            num = 0;
            while (temp != 0){
                rem = temp % 10;
                num = num + rem * rem *rem;
                temp = temp / 10;
            }
            if(i == num){
                if(counter == 0){
                    System.out.println("Armstrong Numbers Between" + start + " and " + end + ":");
                }
                System.out.println(i + " ");
                counter++;
            }
        }
        if(counter == 0)
        {
            System.out.println("There is no Armstrong Between" + start + " and " + end);
        }
    }
}
