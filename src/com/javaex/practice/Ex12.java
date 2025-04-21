package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("숫자1: ");
		long num1 = sc.nextLong();
		System.out.print("숫자2: ");
		long num2 = sc.nextLong();
		System.out.print("숫자3: ");
		long num3 = sc.nextLong();
		
		long min = num1; //가장 작은 수 num1 == min
		
		if(num2 < min) { //num2가 min(num1)보다 작을 때
			min = num2; //가장 작은 수 num2
		}
		if(num3 < min) { //num3이 min(num2)보다 작을 때
			min = num3; //가장 작은 수 num3
		}
		
		
		System.out.println("가장 작은수는 " + min + " 입니다."); 
		
		
		
		
		sc.close();
				
				
	}
	
	
}
