package com.interzonedev.mavenbasics;

import org.junit.Test;

public class FooTest {

	private Foo foo = new Foo();

	@Test
	public void testLogSomething() {

		for (int i = 0; i < 100; i++) {
			foo.logSomething("iteration " + i);
		}

	}

}
