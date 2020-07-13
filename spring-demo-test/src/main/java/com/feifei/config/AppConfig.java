package com.feifei.config;

import com.feifei.beanAnnoT.BeanAnnotationTest;
import com.feifei.dao.UserDaoImpl2;
import org.springframework.context.annotation.*;
import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author feifei
 * @Classname AppConfig
 * @Description TODO
 * @Date 2020/6/3 14:04
 * @Created by 陈群飞
 */
@Configuration
@ComponentScan("com.feifei.dao")
@Import(UserDaoImpl2.class)
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class AppConfig {
	@Bean
	public   BeanAnnotationTest getBeanAnno(){
		return new BeanAnnotationTest();
	}

	@Bean
	public BeanAnnotationTest getBeanAnno2(){
		System.out.println(123);
		return getBeanAnno();
	}
}
