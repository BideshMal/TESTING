package com.java.day1;
import java.util.Scanner;
public class sumOfSquaresN_natural {
	public static int calcSum(int N){
		int sum=0;
		for(int i=1;i<=N;i++) {
			sum+=(i*i);
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter natural number");
		int N=s.nextInt();
		int result=calcSum(N);
		System.out.println(result);
	}

}
