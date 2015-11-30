package com.pt.spring4junit.controller;
//***************************************************************************************************
//***************************************************************************************************
//      Project name                    	: Spring4JunitTest
//      Class Name                          : AuthenticationController
//      Author                              : PurpleTalk, Inc.
//***************************************************************************************************
//      Class Description: Defines the authentication controller functionality.
//***************************************************************************************************
//***************************************************************************************************



import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pt.spring4junit.PtSpring4Junit;
import com.pt.spring4junit.data.User;
import com.pt.spring4junit.util.BaseResponse;

@Controller
@RequestMapping(value = "/authentication")
public class AuthenticationController implements PtSpring4Junit{

	private static final long serialVersionUID = 8270632141736743529L;
	private static final Logger LOGGER = Logger
			.getLogger(AuthenticationController.class);

	@Autowired
	private Properties appPropSource;

	/**
	 * @param user
	 *  firstName
	 *  lastName
	 *  dob
	 *  userName
	 *  password
	 *  gender
	 *  phoneNumber
	 *  snType
	 *  city
	 *  country
	 * @return
	 */
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public Map<String, Object> signup(@RequestBody User user) {

		Map<String, Object> map = null;

		try {
			LOGGER.info("Input Data :"+user);
			map = new ConcurrentHashMap<String, Object>();
			map.put("baseResponse",
					new BaseResponse(appPropSource
							.getProperty("successCode"), appPropSource
							.getProperty("successMsg")));
			LOGGER.info("");
		} catch (Exception e) {
			LOGGER.error(e.getMessage() + " , "+ e);
			map = new ConcurrentHashMap<String, Object>();
			map.put("baseResponse",
					new BaseResponse(appPropSource
							.getProperty("exceptionCode"), appPropSource
							.getProperty("exceptionMsg")));
		}

		return map;
	}
}
