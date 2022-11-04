package com.company;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        int n, temp, r, res;
        res = 0;

        Scanner userInput = new Scanner(System.in);
        System.out.println("Check Armstrong or not");
        System.out.println("Enter the number:");
        n = userInput.nextInt();
        temp = n;
        while(temp != 0){
            r = temp % 10;
            res += Math.pow(r,3);
            temp /= 10;
        }
        if(res == n)
            System.out.println(n + " is an Armstrong number");
        else
            System.out.println(n + " is not an Armstrong number");
    }
}