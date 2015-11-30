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
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pt.spring4junit.repository.UserRepository;
import com.pt.spring4junit.service.UserService;

/**
 * @author govardhan
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={ "classpath*:spring4junit-context-test.xml" })
public class AuthenticationControllerTest {
	
	@Autowired
    private ApplicationContext applicationContext;
	
	@Autowired
	private UserRepository userRepository;
	
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
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.pt.spring4junit.controller.AuthenticationController#signup(com.pt.spring4junit.data.User)}.
	 */
	@Test
	public void testSignup() {

		System.out.println("Test Completed "+applicationContext);
		System.out.println("Test Completed "+userRepository);
		System.out.println("Test Completed "+userService);
	}

}

