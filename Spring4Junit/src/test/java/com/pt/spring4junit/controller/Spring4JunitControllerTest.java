/**
 * 
 */
package com.pt.spring4junit.controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.pt.spring4junit.config.Spring4JunitControllerConfigTest;
import com.pt.spring4junit.config.Spring4JunitMongoDBConfigTest;
import com.pt.spring4junit.config.Spring4JunitServiceConfigTest;
import com.pt.spring4junit.data.User;
import com.pt.spring4junit.repository.UserRepository;
import com.pt.spring4junit.service.UserService;

/**
 * @author govardhan
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { Spring4JunitMongoDBConfigTest.class,
		Spring4JunitServiceConfigTest.class,
		Spring4JunitControllerConfigTest.class }, loader = AnnotationConfigContextLoader.class)
public class Spring4JunitControllerTest {

	@Autowired
	private AuthenticationController authenticationController;
	
	@Autowired
	private UserService userService;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		// TODO:
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link com.pt.spring4junit.controller.AuthenticationController#signup(com.pt.spring4junit.data.User)}
	 * .
	 */
	@Test
	public void testSignup() {
		User user = new User(null, "Govardhan Rao", "Ganji", "22/07/1990", "govardhan.ganji", "123456789", "Male", "Hyderabad", "India", "Telangana", "9963108070", "REGULAR");
		System.out.println("Test Completed " + authenticationController.signup(new User()));
		System.out.println("Test Completed Save " + userService.saveUser(user));
		System.out.println("Test Completed Count " + userService.getUserCount());
		// Assert.fail("Not yet implemented");
	}

}
