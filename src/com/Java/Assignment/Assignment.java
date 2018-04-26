package com.Java.Assignment;

import java.util.Scanner;

public class Assignment {

	private int firstNumber, secondNumber, result;
	public static Scanner scanner = new Scanner(System.in);
	
	public Assignment() {
		System.out.println("Enter first value");
		firstNumber = scanner.nextInt();
		
		System.out.println("Enter second value");
		secondNumber = scanner.nextInt();
			
	}
	
	public void performDivision()
			throws ArithmeticException {
		if(this.secondNumber == 0) {
			throw new ArithmeticException();
		}
		else {
			result = this.firstNumber/this.secondNumber;
			System.out.println("The result is " + result);
		}
	}
	
	public static void main(String[] args) {
		
		Assignment assignment = new Assignment();
		
		try {
				assignment.performDivision();
			}
		catch (Throwable e) {
			System.out.println("Second Number can't be zero");
			while(assignment.secondNumber == 0) {
				System.out.println("Enter the second number ");
				assignment.secondNumber = scanner.nextInt();	
			}
			assignment.performDivision();
		}
		
	}
}
