/**
 * 
 */
package com.pt.spring4junit.config;

import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.pt.spring4junit.controller.AuthenticationController;

/**
 * @author govardhan
 *
 */
@Configuration
public class Spring4JunitControllerConfigTest{

	/**
	 * 
	 */
	public Spring4JunitControllerConfigTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Bean
	public AuthenticationController authenticationController(){
		return new AuthenticationController();
	} 
	
	@Bean(name="appPropSource")
    public static PropertiesFactoryBean applicationPropertiesFactoryBean() {
        PropertiesFactoryBean ppc = new PropertiesFactoryBean();
        ppc.setLocations(new ClassPathResource[]{
        		new ClassPathResource("application.properties"),
        		new ClassPathResource("status.properties")
        });
        ppc.setIgnoreResourceNotFound(true);
        return ppc;
    }

}
