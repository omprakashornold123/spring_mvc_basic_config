/**
 * 
 */
package com.express.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * @author Om prakash
 *
 */
public class LoveCalculaterIntilizer //implements WebApplicationInitializer
{

	public void onStartup(ServletContext servletContext) throws ServletException {

		
		AnnotationConfigWebApplicationContext webApplicationContext=new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(LoveCaluclaterAppConfig.class);
		
		
		//create dispather servlet obj
		DispatcherServlet dispatcherServlet=new DispatcherServlet(webApplicationContext);
			
		ServletRegistration.Dynamic myCustomDispatcherServlet=servletContext.addServlet("myDispatherServlet", dispatcherServlet);
		
		myCustomDispatcherServlet.setLoadOnStartup(1);
		
		myCustomDispatcherServlet.addMapping("/load/*");
		
	}

}
