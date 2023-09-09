package com.kodnest.strings.mutable;

public class Demo1 {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer();
		System.out.println(s1.capacity());
		s1.append("sachin is a good batsman");
		System.out.println(s1.capacity());
		System.out.println("+++++++++++++++++++");
		StringBuilder s2=new StringBuilder();
		System.out.println(s2.capacity());
		s2.append("pramod is a good coder");
		System.out.println(s2.capacity());
		System.out.println(s2);
	}

}
