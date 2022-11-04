package com.company;
import java.util.Scanner;
public class Result {
    public static void main(String[] args){
        int sub1,sub2,sub3;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter marks of sub 1");
        sub1=s.nextInt();
        System.out.println("Enter the marks of sub 2");
        sub2=s.nextInt();
        System.out.println("Enter the marks of sub  3");
        sub3=s.nextInt();
        if(sub1>60 && sub2>60 && sub3>60) {
            System.out.println("PASSED");
        }else if ((sub1>60 && sub2>60) || (sub2>60 && sub3>60) || (sub1>60 && sub3>60)){
            System.out.println("PROMOTED");
        }
        else if((sub1>60 && sub2>60) || (sub1<60 && sub2<60 && sub3<60)){
            System.out.println("FAILED");
        }
    }
}
