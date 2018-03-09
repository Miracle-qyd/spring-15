package com.shsxt.factory;

import com.shsxt.bean.UserService;

public class StaticFactory {
	
	public static UserService createUserService() {
		return new UserService();
	}
	
}
