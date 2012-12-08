package com.mycompany.app;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Path("app")
@Service
public class App {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

	@POST
	@Path("method/{resource}")
	public String app(@PathParam("resource") String resource) {
		LOGGER.info("App app method.");
		return resource;
	}
}
