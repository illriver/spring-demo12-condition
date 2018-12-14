package com.illriver.spring_demo12_conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 判断条件定义
 * @author Pactera
 *
 */
public class WindowsCondition implements Condition{

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		return context.getEnvironment().getProperty("os.name").contains("Windows");
	}
	
}
