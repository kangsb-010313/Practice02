package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		System.out.print("두번재 숫자: ");
		int num2 = sc.nextInt();
		
		
		if (num1 >= num2) {
			int division = num1 / num2;
			int rest = num1 % num2;
			System.out.println("몫: " + division);
			System.out.print("나머지: " + rest);
			
		}else if (num1 <= num2) {
			int division = num2 / num1;
			int rest = num2 % num1;
			System.out.println("몫: " + division);
			System.out.print("나머지: " + rest);
		}
		
		sc.close();
		
		
		
	}

}
