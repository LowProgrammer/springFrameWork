package com.feifei.test;

import com.feifei.config.AppConfig;
import com.feifei.dao.UserDao;
import com.feifei.dao.UserDaoImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.StandardEnvironment;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/**
 * @author feifei
 * @Classname Test
 * @Description TODO
 * @Date 2020/4/26 23:22
 * @Created by 陈群飞
 */

public class Test {
	public static void main(String[] args) {
//		AnnotationConfigApplicationContext configApplicationContext=new AnnotationConfigApplicationContext();
//		configApplicationContext.register(UserDaoImpl.class);
//		configApplicationContext.refresh();


		AnnotationConfigApplicationContext configApplicationContext1=new AnnotationConfigApplicationContext(AppConfig.class);
		UserDao userDao= (UserDao) configApplicationContext1.getBean("userDaoImpl");
		userDao.print();

	}
}
