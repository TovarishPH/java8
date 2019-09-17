package com.ph.java8.defaultMethods;

import java.util.function.Consumer;

public class ConsumidorDeString implements Consumer<String> {

	@Override
	public void accept(String s) {
		System.out.println(s);
	}

}
