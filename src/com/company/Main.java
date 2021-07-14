package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1st task. Loops:
        //Write a program that counts in descending order from 100 to 0;
        //print out only the values that are divisible by 6


        for(int i =100; i> 0; i--) {
            if (i % 6 == 0) {
                System.out.println(i);
            }
        }
         System.out.println("Answer to 1st task(loops): ");

        // 2nd Task. Average:
        // Write a program that takes input from user for 10 numbers
        //and concatenates those string to those strings into one sentence

        //STUCK ON SCANNER
       Scanner sc = new Scanner(System.in);
        System.out.println("how many numbers do you want to enter: ");
        int[] numbers = new int [sc.nextInt()];
        for(int i = 0; i < numbers.length; i++){
            System.out.println("enter a number: ");
            numbers[i] = sc.nextInt();
        }
        //INITIALIZED NUMBER TO VIEW IF SOLUTION WAS RIGHT
  //      float[] numbers ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        float average = 0;
        float sum = 0;

       for (int i = 0; i < numbers.length; i++) {

            sum = sum + numbers[i];
       }

        average = sum / numbers.length;
        System.out.println(" Answer to 2nd task(average): " + average);

        //3rd Task STRINGS
       // Write a program that takes 5 strings and puts them together in sentance
        System.out.println("Noun: ");
        String a = sc.next();

        System.out.println("2nd noun: ");
        String b = sc.next();
        System.out.println("Verb(present continuous): ");
        String c = sc.next();
        System.out.println("3rd noun: ");
        String d = sc.next();
        System.out.println("2nd Verb(present continuous): ");
        String e = sc.next();

        System.out.println(" Answer to 3rd task (strings to sentence): " + a + " and " + b + " were " + c + " on " + d + " and " + e + ".");

        //4th task
        //Write a program that takes 10 numbers and finds the largest number
//        int[] numbers = {12, 15, 18, 19, 25, 9, 45};// using this to check, but it can take numbers from scanner
        int max = Integer.MIN_VALUE;

        for (int element : numbers) {
            max = Math.max(max, element);
        }
        System.out.println("Answer to 3rd task(Max of 10): " + max);

        //5th task
        //Using array output number of odd numbers

        int oddCount = 0;
//        int[] numbers = {12, 15, 18, 19, 25, 9, 45};// comment this out, it uses scanner
//
//
        for(int i = 0; i < numbers.length; i++) {

            if(numbers[i] % 2 ==1) {

                oddCount++;

            }

        }
        System.out.println("Answer to 5th Task(odd numbers): " + oddCount);




    }//End of void main}
}