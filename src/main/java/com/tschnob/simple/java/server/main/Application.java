package com.tschnob.simple.java.server.main;

import javax.inject.Inject;

import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.jersey.jackson1.Jackson1Feature;
import org.glassfish.jersey.server.ResourceConfig;
import org.jvnet.hk2.guice.bridge.api.GuiceBridge;
import org.jvnet.hk2.guice.bridge.api.GuiceIntoHK2Bridge;

public class Application extends ResourceConfig {
	
	@Inject
	public Application(ServiceLocator serviceLocator) {

        //Since Jersey doesn't support Guice, setup a bridge so that Guice will work
		GuiceBridge.getGuiceBridge().initializeGuiceBridge(serviceLocator);
		GuiceIntoHK2Bridge guiceBridge = serviceLocator.getService(GuiceIntoHK2Bridge.class);
		
		guiceBridge.bridgeGuiceInjector(Main.injector);

        //Gets Jackson all squared away with Jersey
		register(Jackson1Feature.class);
		register(DefaultObjectMapperProvider.class);
	}

}
