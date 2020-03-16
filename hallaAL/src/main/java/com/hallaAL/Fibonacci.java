package com.hallaAL;

public class Fibonacci {
	public static int circular(int number) {
		int one=1;
		int two=1;
		int result=-1;
		
		if(number==1) {
			return one;
		}else if(number==2) {
			return two;
		}else {
			for(int i=2;i<number;i++) {
				result=one+two;
				
				one=two; //오른쪽으로 한칸씩 다음 계산을 위해 옮기기
				two=result;
			}
			return result;
		}
	}
	public static int recursion(int number) {
		if(number==1) {
			return 1;
		}else if(number==2) {
			return 1;
		}else {
			return recursion(number-2)+recursion(number-1);
		}
	}
	public static void main(String[] args) {
		System.out.println("피보나치 순환 방법으로 20번째 출력");
		long beforTime=System.nanoTime();
		System.out.println(circular(20));
		long afterime=System.nanoTime();
		System.out.println("작업시간 : "+(afterime-beforTime)+"nanoTime");
		
		System.out.println("피보나치 재귀 방법으로 20번째 출력");
		beforTime=System.nanoTime();
		System.out.println(recursion(20));
		afterime=System.nanoTime();
		System.out.println("작업시간 : "+(afterime-beforTime)+"nanoTime");
		

	}

}
