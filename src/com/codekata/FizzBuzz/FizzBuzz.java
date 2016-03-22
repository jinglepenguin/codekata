package com.codekata.FizzBuzz;

public class FizzBuzz {
    public static void main (String[] args){

        for(int i = 1; i <= 100; i++){
            String number = String.valueOf(i);
            String output = "";

            if( i % 3 == 0 || number.indexOf("3") >= 0){
                output = "Fizz";
            }

            if( i % 5 == 0 || number.indexOf("5") >= 0){
                output = output.concat("Buzz");
            }

            if(output.length() > 0){
                System.out.println(output);
            } else {
                System.out.println(i);
            }
        }

    }
}
