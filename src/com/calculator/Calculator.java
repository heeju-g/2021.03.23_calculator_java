package com.calculator;

import java.util.Scanner;

public class Calculator {
	//3. 이전에 main method에 다 구현했던 기능들을 각각의 method로 빼내어 호출하는 방식으로 만들기
	static int getFirstValue(Scanner sc) {
		System.out.println("첫 번째 입력값 : ");
		int fir = sc.nextInt();
		return fir;
	}
	static String getSymbol(Scanner sc) {
		System.out.println("사칙연산 기호 : ");
		String symbol = sc.next();
		return symbol;
	}
	static int getSecondValue(Scanner sc) {
		System.out.println("두 번쨰 입력값 : ");
		int sec = sc.nextInt();
		return sec;
	}
	
	static int calculate(int fir, String symbol, int sec) {
		int res = 0;
		if(symbol.equals("+")) {
			res = fir + sec;
		}else if(symbol.equals("-")){
			res = fir - sec;
		}else if(symbol.equals("*")) {
			res = fir * sec;
		}else if(symbol.equals("/")) {
			res = fir / sec;
		}else {
			System.out.println("올바른 사직연산 기호가 아닙니다");
		}
		return res;
	}
	static void print(int res) {
		System.out.println( "최종 결과 : " + res + "\n프로그램 중지");
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int fir = getFirstValue(sc);
		int res = fir;
		
		while(true) {
			String symbol = getSymbol(sc);
			if(symbol.equals("quit")) {
				print(res);
				break;
			}
			int sec = getSecondValue(sc);
			res = calculate(res, symbol, sec);
			System.out.println(" 중간 결과 : " + res);
		}
		
    /* 1. 값을 두개만 입력받는 사칙연산 수준 
     *  System.out.println("첫 번째 입력값 : ");
		int fir = sc.nextInt();
		
		System.out.println("사칙연산 기호 : ");
		String symbol = sc.next();
				
		System.out.println("두 번쨰 입력값 : ");
		int sec = sc.nextInt();
		
		//문자열 비교는 equals(), 주소값 비교는 ==
		if(symbol.equals("+")) {
			System.out.println( fir + sec);
		}else if(symbol.equals("-")){
			System.out.println(fir - sec);
		}else if(symbol.equals("*")) {
			System.out.println(fir * sec);
		}else if(symbol.equals("/")) {
			System.out.println(fir / sec );
		}else {
			System.out.println("올바른 사직연산 기호가 아닙니다");
		}
	*/	
		
	/* 2. 계속 값을 받아서 사칙연산을 해나가려면 어느 부분이 반복되어야 할까? 
	  -> 맨 처음 fir + sec 의 결과값이 새로운 fir이 되어야 하고 따라서 연산기호와 sec부분이 반복될 것
	  
		System.out.println("첫 번째 입력값 : ");
		int fir = sc.nextInt();
		
		int res = fir;
		while(true) {
			System.out.println("사칙연산 기호 : ");
			String symbol = sc.next();
			
			if(symbol.equals("quit")) {
				System.out.println( "최종 결과 : " + res + "\n프로그램 중지");
				break;
			}
			
			System.out.println("두 번쨰 입력값 : ");
			int sec = sc.nextInt();
			
			if(symbol.equals("+")) {
				res+=sec;
			}else if(symbol.equals("-")){
				res-=sec;
			}else if(symbol.equals("*")) {
				res*=sec;
			}else if(symbol.equals("/")) {
				res/=sec;
			}else {
				System.out.println("올바른 사직연산 기호가 아닙니다");
			}
			System.out.println(" 중간 결과 : " + res);
		}
	*/
	}
}
