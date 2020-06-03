package com.feifei.dao;

import org.springframework.stereotype.Component;

/**
 * @author feifei
 * @Classname UserDaoImpl
 * @Description TODO
 * @Date 2020/4/26 23:24
 * @Created by 陈群飞
 */
@Component
public class UserDaoImpl implements UserDao {
	@Override
	public void print() {
		System.out.println("print");
	}
}
