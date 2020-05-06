package com.feifei.testPostProcessor;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;

/**
 * @author feifei
 * @Classname TestPostProcessor
 * @Description TODO
 * @Date 2020/5/5 9:44
 * @Created by 陈群飞
 */
public class TestPostProcessor implements BeanPostProcessor, PriorityOrdered {
	@Override
	public int getOrder() {
		return 0;
	}
}
