package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해주세요.");
		
		System.out.print("키: ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게: ");
		double weight = sc.nextDouble();
		
		double standard = (height - 100) * 0.9;
		
		if (weight < standard) {
			System.out.print("저체중");
			
		}else if(weight == standard) {
			System.out.print("표준");
			
		}else if(weight > standard) {
			System.out.print("과체중");
		}
		
		System.out.println(" 입니다.");
		
		System.out.println("표준체중: " + standard);
		
		sc.close();
		
		
	}

}
