package com.illriver.spring_demo12_conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * linux判断条件定义
 * @author Pactera
 *
 */
public class LinuxCondition  implements Condition{

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// TODO Auto-generated method stub
		return context.getEnvironment().getProperty("os.name").contains("linux");
	}

}
