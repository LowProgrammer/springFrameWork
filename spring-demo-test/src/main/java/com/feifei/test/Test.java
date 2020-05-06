package com.feifei.test;

import com.feifei.dao.UserDao;
import com.feifei.dao.UserDaoImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author feifei
 * @Classname Test
 * @Description TODO
 * @Date 2020/4/26 23:22
 * @Created by 陈群飞
 */
public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext configApplicationContext=new AnnotationConfigApplicationContext();
		configApplicationContext.register(UserDaoImpl.class);
		configApplicationContext.refresh();

		UserDao userDao= (UserDao) configApplicationContext.getBean("userDaoImpl");
		userDao.print();

	}
}
