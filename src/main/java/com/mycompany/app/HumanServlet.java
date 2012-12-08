package com.mycompany.app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.jersey.spi.spring.container.servlet.SpringServlet;

public class HumanServlet extends SpringServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3536423960378679428L;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HumanServlet.class);

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		LOGGER.info("HumanServlet service method.");
		super.service(request, response);
	}

}
