package io.netty.example.my;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @program: netty
 * @author: daniel
 * @create: 2021-09-15 11:35
 **/
public class ChooseDemo {
	public static void main(String[] args) {
//		AtomicInteger idx = new AtomicInteger();
//		String[] executors = new String[4];
//		for (int i = 0; i < 5; i++) {
//			int andIncrement = idx.getAndIncrement();
//			System.out.println(Integer.toBinaryString(andIncrement) + " " + Integer.toBinaryString(executors.length - 1));
//			System.out.println(andIncrement & executors.length - 1);
//		}

		BigDecimal amount = new BigDecimal("123.315341234").setScale(2, RoundingMode.HALF_UP);
		amount = amount.multiply(new BigDecimal(100));

		System.out.println(amount.toBigIntegerExact());
	}
}
