package com.java.day1;

public class Fact {
	public static void Fact(int N) {
		if(N==0) {
			System.out.println(1);
		}
		int fact=1;
		for(int i=1;i<=N;i++) {
			fact*=i;
		}
		System.out.println(fact);
	}
 public static void main(String[] args) {
	Fact(5);
}
}
