package com.company;

public class palindromeCheck {
    public static void isPalindrome(int number){
        int reverse = 0;
        int num = number;

        while (number != 0){
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
            }
        if (num == reverse){
            System.out.println(number + " is palindrome.");
        }
        else {
            System.out.println(number + " is not palindrome.");
        }


    }
}
