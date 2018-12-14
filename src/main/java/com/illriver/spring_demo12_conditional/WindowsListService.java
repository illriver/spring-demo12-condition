package com.illriver.spring_demo12_conditional;

/**
 * windows下要创建的Bean的类
 * @author Pactera
 *
 */
public class WindowsListService implements ListService{

	@Override
	public String showListCmd() {
		return "dir";
	}

}
