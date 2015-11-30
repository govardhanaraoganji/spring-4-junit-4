/**
 * 
 */
package com.pt.spring4junit.config;

import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;

/**
 * @author govardhan
 *
 */
@Configuration
@PropertySources(
					{
						@PropertySource(value = "classpath:/application.properties", ignoreResourceNotFound=true),
						@PropertySource(value = "classpath:/status.properties", ignoreResourceNotFound=true)	
					}
				)
@EnableMongoRepositories(basePackages="com.pt.spring4junit.repository")
public class Spring4JunitMongoDBConfigTest extends AbstractMongoConfiguration{

	@Autowired
	private Environment properties;
	
	/**
	 * 
	 */
	public Spring4JunitMongoDBConfigTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Bean
	@Override
	public MongoClient mongo() throws NumberFormatException, UnknownHostException{
		//System.out.println(properties.getProperty("MongoDB.hostName")+"            "+properties.getProperty("MongoDB.port"));
		return new MongoClient(properties.getProperty("MongoDB.hostName"), Integer.parseInt(properties.getProperty("MongoDB.port")));
	} 
	
	@Bean
	public MongoTemplate mongoTemplate() throws NumberFormatException, UnknownHostException{
		return new MongoTemplate(mongo(),properties.getProperty("MongoDB.dbName"));
	}

	@Override
	protected String getDatabaseName() {
		// TODO Auto-generated method stub
		//System.out.println("DB Name :"+properties.getProperty("MongoDB.dbName"));
		return properties.getProperty("MongoDB.dbName");
	}

	  @Override
	  protected String getMappingBasePackage() {
	    return "com.pt.spring4junit.data";
	  }

}
