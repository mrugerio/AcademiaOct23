package com.sim0112.v2;

import java.util.Arrays;

public class TestClass {
	public static void main(String args[]) {
		A[] a, a1;
		B[] b;
		a = new A[10];
		a1 = a;
		b = new B[20];
		//a = b; // 1
		b = (B[]) a; // 2
		b = (B[]) a1; // 3
		System.out.println(Arrays.toString(b));
	}
}

class A {
}

class B extends A {
}