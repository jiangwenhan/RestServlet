package com.mycompany.app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.jersey.spi.spring.container.servlet.SpringServlet;

public class AppServlet extends SpringServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4595577263447361078L;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AppServlet.class);

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		LOGGER.info("AppServlet service method.");
		super.service(request, response);
	}

}
