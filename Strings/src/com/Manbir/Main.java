package com.Manbir;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String myString = "This is a String";
        System.out.println(myString);
        myString = myString + ", and this is more";
        System.out.println(myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        //Challenge
        double var1 = 20;
        double var2 = 80;
        double sum = (var1 + var2) * 25;
        double rem = sum % 40;
        System.out.println(rem);
        if (rem <= 20){
            System.out.println("Total was over the limit");
        }

    }
}
