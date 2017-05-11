package com.andor.springtutorial.si;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.andor.springtutorial.bean.Employee;
import com.andor.springtutorial.bean.Manager;

public class InjectSetter {
public static void main(String[] args) {
	AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContextSI.xml");
	ctx.registerShutdownHook();
	Employee emp=(Employee) ctx.getBean("employee");
	Manager manager=(Manager) ctx.getBean("manager");
	System.out.println(manager);
	System.out.println(emp);
}
}
