package com.andor.springtutorial.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class InjectAnnotation {
	public static void main(String[] args) {
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");
		ctx.registerShutdownHook();
		SampleConfig sampleConfig=ctx.getBean(SampleConfig.class);
		System.out.println(sampleConfig.Tester());
	}

}
