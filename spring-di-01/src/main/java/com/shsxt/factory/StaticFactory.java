package com.shsxt.factory;

/**
 * 静态工厂
 * @author Mr. Sun
 *
 *   2018年3月8日  下午5:04:23
 */
public class StaticFactory {

	public static UserService createUserService(){
		
		return new UserService();
	};
}
