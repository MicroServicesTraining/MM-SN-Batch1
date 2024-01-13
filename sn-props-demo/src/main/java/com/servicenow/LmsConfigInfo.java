/**
 * 
 */
package com.servicenow;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

/**
 * 
 */
@RefreshScope
@Data
//@PropertySource("file:D:\\OnlineClass\\ServiceNow\\config\\lms.properties")
//@PropertySource("classpath:config/lms.properties")
//@ConfigurationProperties(prefix = "lms")
@Configuration
public class LmsConfigInfo {

	@Value("${lms.banner:Default Banner}")
	private String banner;

	@Value("${lms.minlimit:10}")
	private Integer minLimit;

	@Value("${lms.maxlimit:100}")
	private Integer maxLimit;

	@Value("${lms.password:pwd}")
	private String password;
}
