package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
//		아래와 같이 작성된 코드가 있다.
//		보기와 같은 형식으로 나이가 입력되었을 때 결과값을 예상하여 작성해 보세요
		
		/*
		 
		 (1)
		 나이를 입력해주세요
		 나이: 15
		 '2번 그룹'
		 입니다.
		 
 		 (2)
		 나이를 입력해주세요
		 나이: 19
		 '2번 그룹'
		 입니다. 
		 
 		 (3)
		 나이를 입력해주세요
		 나이: 20
		 '2번 그룹'
		 입니다. 
		 
 		 (4)
		 나이를 입력해주세요
		 나이: 21
		 "1번 그룹"입니다.
		 
		 (5)
		 나이를 입력해주세요
		 나이: 100
		 "1번 그룹"입니다. 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		if (age > 20) {
			System.out.print("\"1번그룹\"");
		
		}else {
			System.out.println("\'2번그룹\'");
		}
		
		System.out.println("입니다.");
		
		
		
		sc.close();
		
	}

}
