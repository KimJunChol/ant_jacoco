package com.example.jacoco;

public class Calculator {
	public long add(long a, long b) {
		return a+b;
	}
	
	public long subtract(long a, long b) {
		return a-b;
	}
	
	public long multiply(long a, long b) {
		return a*b;
	}
	
	public long divide(long a, long b) {
		if (b==0) {
			throw new IllegalArgumentException("Cannot Divide 0");
		}
		return a/b;
	}
	
	public void main(long a, long b) {
		System.out.println("hello test");
	}
}
