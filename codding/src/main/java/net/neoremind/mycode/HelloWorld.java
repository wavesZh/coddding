package net.neoremind.mycode;

import java.util.Random;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("hello world");
		System.out.println(1<<31);
		
		Random ran = new Random(100);
		for (int i = 0; i < 10; i++) {
			System.out.println(Math.abs(ran.nextInt())%100);
		}
	}
	
}