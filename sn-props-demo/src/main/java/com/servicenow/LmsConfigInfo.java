/**
 * 
 */
package com.servicenow;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Data;

/**
 * 
 */
@Data
@PropertySource("file:D:\\OnlineClass\\ServiceNow\\config\\lms.properties")
//@PropertySource("classpath:config/lms.properties")
//@ConfigurationProperties(prefix = "lms")
@Configuration
public class LmsConfigInfo {

	@Value("${lms.banner:Default Banner}")
	private String banner;
	
	@Value("${lms.minlimit}")
	private Integer minLimit;
	
	@Value("${lms.maxlimit}")
	private Integer maxLimit;
	
	@Value("${lms.password}")
	private String password;
}
