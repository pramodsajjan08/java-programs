package com.kodnest.strings.mutable;

public class Demo {
	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("rama");
		System.out.println(sb1);
		sb1.append("sita");
		System.out.println(sb1);
		
		
		StringBuilder strb=new StringBuilder("ravana");
		System.out.println(strb);
		strb.append("asura");
		System.out.println(strb);
	}

}
