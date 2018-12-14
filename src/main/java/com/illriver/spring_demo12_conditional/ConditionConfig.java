package com.illriver.spring_demo12_conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * 配置文件
 * @author Pactera
 *
 */
@Configuration
public class ConditionConfig {
	
	@Bean
	@Conditional(WindowsCondition.class)
	public ListService WindowsListService() {
		return new WindowsListService();
	}
	
	@Bean
	@Conditional(LinuxCondition.class)
	public ListService LinuxListService() {
		return new WindowsListService();
	}
}
