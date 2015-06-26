package com.tschnob.simple.java.server.main;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig.Feature;

@Provider
public class DefaultObjectMapperProvider implements ContextResolver<ObjectMapper> {

    final ObjectMapper defaultObjectMapper;
 
    public DefaultObjectMapperProvider() {
        defaultObjectMapper = createDefaultMapper();
    }
 
    @Override
    public ObjectMapper getContext(Class<?> type) {
    	return defaultObjectMapper;
    }

    //This is where Guice gets the Jackson ObjectMapper!
    private static ObjectMapper createDefaultMapper() {
        final ObjectMapper result = new ObjectMapper();

        //To make things look pretty when it gets converted
        result.configure(Feature.INDENT_OUTPUT, true);
 
        return result;
    }

}
