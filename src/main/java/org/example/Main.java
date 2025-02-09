package org.example;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberToWords(123)));
        System.out.println(Arrays.toString(numberToWords(1010)));
        System.out.println(Arrays.toString(numberToWords(-12)));
    }

    public static Boolean isPalindrome(int x){
        int temp=x;

        if (temp<0){
            temp *= -1;
        }
        System.out.println(temp);

        int reverse = 0;

        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }

        return x == reverse;
    }

    public static Boolean isPerfectNumber(int x){
        int sumOfDividents = 0;
        int temp=1;

        while (temp<x){
            if(x%temp==0){
                sumOfDividents += temp;
            }
            temp++;
        }


        return sumOfDividents == x;

    }

    public static String[] numberToWords (int x){
        if (x<0){
            return new String[]{"Invalid Value"};
        }
        if (x==0){
            return new String[]{"Sıfır"};
        }

        int remainder;
        String[] numbersInText = {"Sıfır", "Bir", "İki", "Üç", "Dört", "Beş", "Altı", "Yedi", "Sekiz", "Dokuz"};
        ArrayList<String> result = new ArrayList<>();
        int temp = x;

        while (temp>0) {
            remainder = temp % 10;
            result.add(0,numbersInText[remainder]);
            temp = temp / 10;
        }


        return result.toArray(new String[0]);
    }
}
