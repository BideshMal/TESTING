package com.java.day1;



public class SumofN_natural {
	public static int sum(int N) {
		int sum=0;
		for(int i=1;i<=N;i++) {
			sum+=i;
		}
		return sum;
	}
public static void main(String[] args) {
	int result=sum(5);
	System.out.println(result);
}
}
