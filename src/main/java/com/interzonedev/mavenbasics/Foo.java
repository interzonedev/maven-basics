package com.interzonedev.mavenbasics;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

public class Foo {

	private final Logger log = (Logger) LoggerFactory.getLogger(getClass());

	public void logSomething(String message) {

		log.debug("logSomething debug: " + message);
		log.info("logSomething info: " + message);

	}

}
