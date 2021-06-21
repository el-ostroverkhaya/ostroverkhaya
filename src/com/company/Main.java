package com.company;

public class Main {

    public static void main(String[] args) {
	long number = Long.MIN_VALUE;
	System.out.println(number);
	String numberBinary = Long.toBinaryString(number);
	System.out.println(numberBinary);

	for (int i = 0; i < numberBinary.length()-1; i++) {
	    char character = numberBinary.charAt((i));
		int count = 0;
		if (character == '1')  count++;
    }
    }
}
