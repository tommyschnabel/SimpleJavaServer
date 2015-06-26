package com.tschnob.simple.java.server.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

public class Main extends GuiceServletContextListener {
	
	static Injector injector;

	@Override
	protected Injector getInjector() {

        //Install Guice modules here!
		injector = Guice.createInjector();

		return injector;
	}

	
}
