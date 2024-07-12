package com.java.day1;

public class ReverseString {
	public static void Reverse(String S) {
		StringBuilder s=new StringBuilder();
		int end=S.length();
		for(int i=end-1;i>=0;i--) {
			s=s.append(S.charAt(i));
		}
		System.out.println(s);
	}
	public static void main(String[] args) {
		Reverse("Bidesh");
	}
}
