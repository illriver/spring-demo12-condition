package com.illriver.spring_demo12_conditional;

/**
 * linux下bean的类
 * @author Pactera
 *
 */
public class LinuxListService implements ListService{

	@Override
	public String showListCmd() {
		// TODO Auto-generated method stub
		return "ls";
	}

}
