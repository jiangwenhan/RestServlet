package com.mycompany.app;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
@Path("human")
public class Human {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Human.class);
	
	@POST
	@Path("method/{resource}")
	public String human(@PathParam("resource") String resource) {
		LOGGER.info("Human human method.");
		return resource;
	}
}
