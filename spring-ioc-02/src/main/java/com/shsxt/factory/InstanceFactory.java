package com.shsxt.factory;

import com.shsxt.bean.UserService;
import com.shsxt.bean.UserService2;

public class InstanceFactory {

	public  UserService2 createUserService2 () {
		return new UserService2();
	}
}
